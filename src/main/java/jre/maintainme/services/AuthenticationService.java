package jre.maintainme.services;

import java.util.Date;

import javax.crypto.SecretKey;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import static java.util.Collections.emptyList;

public class AuthenticationService {
    private static final SecretKey SECRET_KEY = Keys.secretKeyFor(SignatureAlgorithm.HS512);

    protected static final long EXPIRATION_TIME = 86400000; // 1 day in ms
    @Value("${jwt.secret}")
    protected static String SIGNING_KEY;
    protected static final String PREFIX = "Bearer";

    // Add token to Authorisation header
    public static void addToken(HttpServletResponse response, String username) {
        String jwtToken = createJWT("MaintainMe", username);

        response.addHeader("Authorization", PREFIX + " " + jwtToken);
        response.addHeader("Access-Control-Expose-Headers", "Authorization");
    }

    public static Authentication getAuthentication(HttpServletRequest request) {
        String token = request.getHeader("Authorization");

        if(token != null) {
            String user = Jwts.parserBuilder()
                                .setSigningKey(SECRET_KEY)
                                .build()
                                .parseClaimsJws(token.replace(PREFIX, ""))
                                .getBody()
                                .getSubject();

            if(user != null) {
                return new UsernamePasswordAuthenticationToken(user, null, emptyList());
            }
        }

        return null;
    }

    private static String createJWT(String issuer, String subject) {
        //SecretKey key = Keys.secretKeyFor(SignatureAlgorithm.HS512);
        long nowMS = System.currentTimeMillis();
        Date now = new Date(nowMS);
        
        return Jwts.builder()
                    .setIssuedAt(now)
                    .setExpiration(new Date(nowMS + EXPIRATION_TIME))
                    .setSubject(subject)
                    .setIssuer(issuer)
                    .signWith(SECRET_KEY)
                    .compact();
    }
}
