package jre.maintainme.configuration;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import jre.maintainme.filters.AuthenticationFilter;
import jre.maintainme.filters.LoginFilter;
import jre.maintainme.services.UserDetailsServiceImpl;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;


@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Autowired UserDetailsServiceImpl userDetailsService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //http.csrf().disable().authorizeRequests().anyRequest().permitAll(); // TODO: Remove this when security has been implemented
        //http.headers().frameOptions().disable(); // TODO: Remove this when security has been implemented.

        http.cors().and().authorizeRequests().antMatchers(HttpMethod.POST, "/login").permitAll()
            .anyRequest().authenticated().and().addFilterBefore(new LoginFilter("/login", authenticationManager()),
                                                                                UsernamePasswordAuthenticationFilter.class)
            .addFilterBefore(new AuthenticationFilter(), UsernamePasswordAuthenticationFilter.class);
    }
    
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());
    }

    @Bean
    protected CorsConfigurationSource corsConfigurationSource() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();

        CorsConfiguration config = new CorsConfiguration();
        config.setAllowedOrigins(Arrays.asList("*"));
        config.setAllowedMethods(Arrays.asList("*"));
        config.setAllowedHeaders(Arrays.asList("*"));
        config.setAllowCredentials(true);
        config.applyPermitDefaultValues();

        source.registerCorsConfiguration("/**", config);
        
        return source;
    }
}
