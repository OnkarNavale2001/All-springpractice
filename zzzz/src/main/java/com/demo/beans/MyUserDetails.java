package com.demo.beans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class MyUserDetails implements UserDetails {

    private final User user;

    public MyUserDetails(User user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(user.getRole()));
        return authorities;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getEmail(); // Use email as username
    }

    @Override
    public boolean isAccountNonExpired() {
        return true; // Account is not expired by default
    }

    @Override
    public boolean isAccountNonLocked() {
        return true; // Account is not locked by default
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true; // Credentials are not expired by default (consider implementing logic if needed)
    }

    @Override
    public boolean isEnabled() {
        return true; // Account is enabled by default
    }
}
