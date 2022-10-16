package com.assignment.MarketApplication.service.utility;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class JwtToken {
    private final String SECRET_KEY = "satu-dua-tiga-empat-lima";
    private final String AUDIENCE = "MarketApplication";

    public String generateToken(String username) {
        var builder = Jwts.builder();
        builder = builder
                .setAudience(this.AUDIENCE)
                .claim("username", username)
                .setIssuer("http://localhost:3000")
                .signWith(SignatureAlgorithm.HS256, this.SECRET_KEY);
        var token = builder.compact();
        return token;
    }

    private Claims getClaims(String token){
        var parser = Jwts.parser().setSigningKey(SECRET_KEY);
        var signatureAndClaims = parser.parseClaimsJws(token);
        var claims = signatureAndClaims.getBody();
        return claims;
    }

    public String getUsername(String token){
        var claims = getClaims(token);
        var username = claims.get("username", String.class);
        return username;
    }

    public Boolean validateToken(String token, UserDetails userDetails){
        var claims = getClaims(token);
        var username = claims.get("username", String.class);
        var audience = claims.getAudience();
        var isValid = username.equals(userDetails.getUsername()) && audience.equals(AUDIENCE);
        return isValid;
    }
}
