package com.rmaassurance.emissiondirecte.security.controller;


import com.rmaassurance.emissiondirecte.security.auth.AuthentificationRequest;
import com.rmaassurance.emissiondirecte.security.auth.AuthentificationResponse;
import com.rmaassurance.emissiondirecte.security.auth.RegisterRequest;
import com.rmaassurance.emissiondirecte.security.exception.AuthException;
import com.rmaassurance.emissiondirecte.security.service.AuthenticationService;
import com.rmaassurance.emissiondirecte.security.service.LogoutService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
@CrossOrigin
public class AuthentificationController {
    private  final AuthenticationService authenticationService;
    private  final LogoutService logoutService;

    @PostMapping("/register")
    public ResponseEntity<AuthentificationResponse> register(@RequestBody RegisterRequest request ) throws AuthException {
        return ResponseEntity.ok(authenticationService.register(request));
    }
    @PostMapping("/authenticate")
    public ResponseEntity<AuthentificationResponse> authenticate(@RequestBody AuthentificationRequest request ){
        return ResponseEntity.ok(authenticationService.authenticate(request));
    }


    @PostMapping("/refresh-token")
    public void refreshToken(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws IOException {
        authenticationService.refreshToken(request, response);
    }


    @GetMapping("/logout")
    public ResponseEntity<?> logout(HttpServletRequest request, HttpServletResponse response) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
      //  if (authentication != null) {
            new SecurityContextLogoutHandler().logout(request, response, authentication);

        logoutService.logout(request, response, authentication);
     //   }
        return ResponseEntity.ok("Logout successful");
    }



}
