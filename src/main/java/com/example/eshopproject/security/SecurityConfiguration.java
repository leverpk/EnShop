package com.example.eshopproject.security;

import com.example.eshopproject.repository.CustomerRepository;
import com.example.eshopproject.service.CustomerService;
import com.example.eshopproject.service.JpaCustomerService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@AllArgsConstructor
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    private final JpaCustomerService jpaCustomerService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(jpaCustomerService).passwordEncoder(NoOpPasswordEncoder.getInstance());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .headers()
                .and()
                .authorizeRequests()
//                .antMatchers("/category/add").hasRole("ADMIN")
//                .antMatchers("/console/**").permitAll()
                .anyRequest().permitAll()
                .and()
                .headers().frameOptions().disable()
                .and()
                .formLogin()
                .and()
                .logout()
                .logoutSuccessUrl("/");
    }
}
