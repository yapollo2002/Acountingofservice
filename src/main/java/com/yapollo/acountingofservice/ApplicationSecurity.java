package com.yapollo.acountingofservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class ApplicationSecurity extends WebSecurityConfigurerAdapter {

          public void configure(WebSecurity web) throws Exception{
            //  web
              //        .ignoring()
                //      .antMatchers("/**");
          }
          @Override
          protected void configure(HttpSecurity http) throws Exception {
              http
                      .csrf().disable()
                      .httpBasic()
                      .and()
                      .authorizeRequests()
                      .antMatchers(HttpMethod.POST, "/**").hasRole("ADMIN")
                      .antMatchers(HttpMethod.PUT, "/**").hasRole("ADMIN")
                      .antMatchers(HttpMethod.DELETE, "/**").hasRole("ADMIN")
                      .antMatchers(HttpMethod.GET, "/all").permitAll()
                      .and()
                      .csrf().disable()
                      .formLogin().disable();
          }

          /*@Bean
          @Override
          protected UserDetailsService userDetailsService(){
              return  new InMemoryUserDetailsManager(
                  User.builder()
                          .username("admin")
                          .password(passwordEncoder().encode("admin"))
                          .roles("Admin")
                          .build()
                  );
          }*/
          /*@Override
          protected void configure(AuthenticationManagerBuilder auth) throws Exception{

              auth.inMemoryAuthentication()
                      .withUser("admin").password("{noop}admin").roles("ADMIN");
          } */

          /*  @Bean
          protected PasswordEncoder passwordEncoder() {
              return new BCryptPasswordEncoder(12);
        } */
          @Bean
          @Override
          public UserDetailsService userDetailsService() {
              UserDetails user =
                      User.withDefaultPasswordEncoder()
                              .username("admin")
                              .password("admin")
                              .roles("ADMIN")
                              .build();

              return new InMemoryUserDetailsManager(user);
          }

}
