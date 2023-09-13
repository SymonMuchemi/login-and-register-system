package com.example.demo.security;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@AllArgsConstructor
@EnableWebSecurity
public class PasswordEncoding extends WebSecurityConfigurerAdapter{
}
