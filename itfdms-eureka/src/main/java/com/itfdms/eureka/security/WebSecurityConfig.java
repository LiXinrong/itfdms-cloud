package com.itfdms.eureka.security;/**
 * @title: WebSecurityConfig
 * @projectName itfdms-cloud
 * @description: TODO
 * @author lxr
 * @date 2019/5/1415:14
 */

import lombok.SneakyThrows;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

/**
 * @title: WebSecurityConfig
 * @projectName itfdms-cloud
 * @description: TODO
 * @author lxr
 * @date 2019/5/1415:14
 */

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    @SneakyThrows
    protected void configure(HttpSecurity http){
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.NEVER);
        http.csrf().ignoringAntMatchers("/eureka/**").
                disable().
                authorizeRequests().
                antMatchers("/actuator/**").
                permitAll().
                anyRequest().
                authenticated().
                and().
                httpBasic();
    }
}

