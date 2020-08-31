package com.tueteam.apl.config.auth;

import com.tueteam.apl.domain.member.Role;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

@RequiredArgsConstructor
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  private final CustomOAuth2MemberService customOAuth2MemberService;

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http
        .csrf().disable()
        .headers().frameOptions().disable()
        .and()
        .authorizeRequests()
        .antMatchers("/", "/css/**", "/img/**", "/js/**", "/assets/**").permitAll()
        .antMatchers("/login/testUserLogin").permitAll()
        .antMatchers("/api/**").hasRole(Role.MEMBER.name())
        .anyRequest().authenticated()
        .and()
        .logout().logoutSuccessUrl("/")
        .and()
        .oauth2Login().userInfoEndpoint().userService(customOAuth2MemberService);

  }
}
