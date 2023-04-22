package com.core.project.spring.usermanagement.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {
	
	@Bean 
	PasswordEncoder passwordEncoder() { 
	    return new BCryptPasswordEncoder(); 
	}

    @Bean
    InMemoryUserDetailsManager userDetailsService() {
		UserDetails user1 = User.withUsername("anjali.gupta")
	            .password(passwordEncoder().encode("anjali@123"))
	            .roles("USER")
	            .build();
	        UserDetails admin = User.withUsername("admin")
	            .password(passwordEncoder().encode("admin"))
	            .roles("ADMIN")
	            .build();
	        return new InMemoryUserDetailsManager(user1, admin);
    }
    
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    	
    	http.csrf()
        .disable()
        .authorizeRequests()
        .requestMatchers("/admin/**")
        .hasRole("ADMIN")
        .requestMatchers("/anonymous*")
        .anonymous()
        .requestMatchers("/login*")
        .permitAll()
        .anyRequest()
        .authenticated()
        .and()
        .formLogin()
        .loginPage("/login.html")
        .loginProcessingUrl("/perform_login")
        .defaultSuccessUrl("/homepage.html", true)
        .failureUrl("/login.html?error=true")
//        .failureHandler(authenticationFailureHandler())
        .and()
        .logout()
        .logoutUrl("/perform_logout")
        .deleteCookies("JSESSIONID");
//        .logoutSuccessHandler(logoutSuccessHandler());
        
         return http.build();
    }

}
