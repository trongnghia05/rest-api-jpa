package com.maitrongnghia.restapi.config;

import org.springframework.beans.factory.BeanInitializationException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.zalando.problem.spring.web.advice.security.SecurityProblemSupport;

import javax.annotation.PostConstruct;

//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)
//@Import(SecurityProblemSupport.class)
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//    private final AuthenticationManagerBuilder authenticationManagerBuilder;
//    private final UserDetailsService userDetailsService;
//    private final SecurityProblemSupport problemSupport;
//
//    public SecurityConfiguration(AuthenticationManagerBuilder authenticationManagerBuilder, UserDetailsService userDetailsService, SecurityProblemSupport problemSupport) {
//        this.authenticationManagerBuilder = authenticationManagerBuilder;
//        this.userDetailsService = userDetailsService;
//        this.problemSupport = problemSupport;
//    }
//
//    @PostConstruct
//    public void init() {
//        try {
//            authenticationManagerBuilder.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
//        } catch (Exception e) {
//            throw new BeanInitializationException("Security configuration failed", e);
//        }
//    }
//
//    @Override
//    @Bean
//    public AuthenticationManager authenticationManagerBean() throws Exception {
//        return super.authenticationManagerBean();
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//
//    @Override
//    public void configure(HttpSecurity http) throws Exception {
//        http
//                .cors()
//                .and()
//                .csrf()
//                .and()
//                .exceptionHandling().accessDeniedPage("/403")
//                .and()
//                .headers()
//                .frameOptions()
//                .disable()
//                .and().authorizeRequests()
//                .antMatchers("/dictionary/**").hasAnyRole("ADMIN", "USER")
//                .antMatchers("/dictionary").hasAnyRole("ADMIN", "USER")
//                .antMatchers("/admin/**").hasRole("ADMIN")
//                .antMatchers("/admin").hasRole("ADMIN")
//                .antMatchers("/login**").permitAll()
//                .antMatchers("/**").permitAll()
//                .and()
//                .formLogin()
//                .loginPage("/login")
//                .loginProcessingUrl("/loginAction")
//                .successHandler(customAuthenticationSuccessHandler())
//                .failureHandler(customAuthenticationFailureHandler())
//                .usernameParameter("username")
//                .passwordParameter("password")
//                .permitAll()
//                .and()
//                .logout()
//                .logoutSuccessUrl("/login?message=logout").permitAll()
//                .and()
//                .sessionManagement()
//                .sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED)
//                .maximumSessions(5)
//                .expiredUrl("/login?message=expired");
//    }
//
//    @Bean
//    public AuthenticationFailureHandler customAuthenticationFailureHandler() {
//        return new CustomAuthenticationFailureHandler(loginAttemptService);
//    }
//
//    @Bean
//    public AuthenticationSuccessEventListener customAuthenticationSuccessHandler() {
//        return new AuthenticationSuccessEventListener();
//    }
//}
