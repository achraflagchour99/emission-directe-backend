package com.rmaassurance.emissiondirecte.security.service;

import com.rmaassurance.emissiondirecte.security.user.UserRepository;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class JwtService {

   private final UserRepository userRepository;
    private long jwtExpiration;

    private long refreshExpiration;
    private static final String SECRET_KEY ="635166546A576E5A7134743777217A25432A462D4A614E645267556B58703273";

    public JwtService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String extractUsername(String token) {
        return extractClaim(token,Claims::getSubject);
    }
    private Claims extractAllClaims(String token) {
        return Jwts
                .parserBuilder()
                .setSigningKey(getSignInKey())
                .build()
                .parseClaimsJws(token)
                .getBody();
    }

    private Key getSignInKey() {
        byte[] keyBytes = Decoders.BASE64.decode(SECRET_KEY);
        return Keys.hmacShaKeyFor(keyBytes);
    }
    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
        final Claims claims = extractAllClaims(token);
        return claimsResolver.apply(claims);
    }

    public String generateToken(
            UserDetails userDetails
    ) {
        return buildToken( new HashMap<>(), userDetails, refreshExpiration);
    }
    public String buildToken_2(UserDetails userDetails) {

        Map<String, Object> extraClaims = null;
        long expiration=refreshExpiration;

        List<String> roles = userDetails.getAuthorities()
                .stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.toList());

        Map<String, Object> claims = new HashMap<>();
        claims.put("roles", roles);
        claims.putAll(extraClaims);

        return Jwts
                .builder()
                .setClaims(claims)
                .setSubject(userDetails.getUsername() )
                .setIssuedAt(new Date(System.currentTimeMillis()))

                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 900000))
                .signWith(getSignInKey(), SignatureAlgorithm.HS256)
                .compact();
    }

    private String buildToken(
            Map<String, Object> extraClaims,
            UserDetails userDetails,
            long expiration
    ) {
        List<String> roles = userDetails.getAuthorities()
                .stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.toList());

        var user = userRepository.findByEmail(userDetails.getUsername())
                .orElseThrow();
        Map<String, Object> claims = new HashMap<>();
        claims.put("roles", roles);
        claims.put("firstName", user.getFirstname());
        claims.put("lastname", user.getLastname());
        claims.put("adresse", userDetails.getUsername());
        claims.putAll(extraClaims);

        return Jwts
                .builder()
                .setClaims(claims)
                .setSubject(userDetails.getUsername() )
                .setIssuedAt(new Date(System.currentTimeMillis()))

                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 900000))
                .signWith(getSignInKey(), SignatureAlgorithm.HS256)
                .compact();
    }

    public boolean isTokenValid(String token, UserDetails userDetails) {
        final String username = extractUsername(token);
        return (username.equals(userDetails.getUsername())) && !isTokenExpired(token);
    }
    private boolean isTokenExpired(String token) {
        return extractExpiration(token).before(new Date());
    }
    private Date extractExpiration(String token) {
        return extractClaim(token,Claims::getExpiration);
    }
    public String generateRefreshToken(
            UserDetails userDetails
    ) {
        return buildToken(new HashMap<>(), userDetails, refreshExpiration);
    }

}
