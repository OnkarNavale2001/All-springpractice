package com.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    // Define a method to provide user details service
    @Bean
    public UserDetailsService userDetailsService() {
        return new MyUserDetailsService(); // Implement this class to load user details
    }

    // Define a method to provide password encoder
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // Define a method to provide authentication provider
    @Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService());
        authProvider.setPasswordEncoder(passwordEncoder());
        return authProvider;
    }

    // Configure authentication manager
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authenticationProvider());
    }

    // Configure HTTP security
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/admin/**").hasRole("ADMIN") // Require ADMIN role for /admin/**
                .antMatchers("/user/**").hasRole("USER")   // Require USER role for /user/**
                .antMatchers("/").permitAll()              // Allow access to home page
                .and()
                .formLogin().loginPage("/login")           // Specify custom login page
                .defaultSuccessUrl("/redirectByRole")      // Redirect after successful login
                .permitAll()
                .and()
                .logout().logoutUrl("/logout")            // Specify logout URL
                .logoutSuccessUrl("/login?logout")        // Redirect after logout
                .permitAll()
                .and()
                .exceptionHandling().accessDeniedPage("/403") // Specify access denied page
                .and()
                .csrf().disable();                        // Disable CSRF protection
    }
}
