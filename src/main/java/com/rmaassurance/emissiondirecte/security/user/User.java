package com.rmaassurance.emissiondirecte.security.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "UserAuthcon" ,
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"firstname", "lastname"})
        })
public class User implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    private String firstname;

    @NotNull
    private String lastname;

    @Column(unique = true)
    @NotNull
    private String email;

    @NotNull
    private String password;
 //   @Enumerated(EnumType.STRING)
  //  List<Role> role;
  //  Role role;

    @Column(name = "role" )
    private String roles;
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(roles));
       // return List.of(new SimpleGrantedAuthority(role.name()));

      /*  List<GrantedAuthority> authorities = new ArrayList<>();
        for (Role r : role) {
            authorities.add(new SimpleGrantedAuthority(r.name()));
        }
        return authorities;*/
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
