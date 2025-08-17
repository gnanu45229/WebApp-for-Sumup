//package cys.gnanu.SumUp.security;
//
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//import io.jsonwebtoken.security.Keys;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//
//import javax.crypto.SecretKey;
//import java.time.Instant;
//import java.util.Date;
//import java.util.Map;
//
//@Component
//public class JWTUtils {
//    private final SecretKey key;
//    private final long expiryMinutes;
//
//    public JWTUtils(@Value("${app.jwt.secret}") String secret,
//                   @Value("${app.jwt.expiryMinutes}") long expiryMinutes) {
//        this.key = Keys.hmacShaKeyFor(secret.getBytes());
//        this.expiryMinutes = expiryMinutes;
//    }
//
//    public String generate(String subject, Map<String, Object> claims) {
//        Instant now = Instant.now();
//        return Jwts.builder()
//                .setSubject(subject)
//                .addClaims(claims)
//                .setIssuedAt(Date.from(now))
//                .setExpiration(Date.from(now.plusSeconds(expiryMinutes * 60)))
//                .signWith(key, SignatureAlgorithm.HS256)
//                .compact();
//    }
//}