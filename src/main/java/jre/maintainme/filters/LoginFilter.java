package jre.maintainme.filters;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.security.core.AuthenticationException;

import jre.maintainme.security.AccountCredentials;
import jre.maintainme.services.AuthenticationService;

import static java.util.Collections.emptyList;

public class LoginFilter extends AbstractAuthenticationProcessingFilter {
    public LoginFilter(String url, AuthenticationManager authMan) {
        super(new AntPathRequestMatcher(url));
        setAuthenticationManager(authMan);
    }

    @Override
    public Authentication attemptAuthentication(
      HttpServletRequest req, HttpServletResponse res)
              throws AuthenticationException, IOException, ServletException {
      AccountCredentials creds = new ObjectMapper()
          .readValue(req.getInputStream(), AccountCredentials.class);
      return getAuthenticationManager().authenticate(
          new UsernamePasswordAuthenticationToken(
              creds.getUsername(),
              creds.getPassword(),
              emptyList()
          )
      );
    }

    @Override
    protected void successfulAuthentication(
        HttpServletRequest request,
        HttpServletResponse response,
        FilterChain chain,
        Authentication auth
    ) throws IOException, ServletException {
        AuthenticationService.addToken(response, auth.getName());
    }
}
