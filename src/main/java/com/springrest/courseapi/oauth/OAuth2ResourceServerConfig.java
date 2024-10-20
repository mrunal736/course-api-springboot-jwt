package com.springrest.courseapi.oauth;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

public class OAuth2ResourceServerConfig extends ResourceServerConfigurerAdapter {
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/courses").authenticated()
                .antMatchers("/home").authenticated()
                .antMatchers("/login").permitAll();


    }
}
