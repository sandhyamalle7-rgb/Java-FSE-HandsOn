package com.example.demo.util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

public class JwtUtil {

    private static final String SECRET_KEY = "cognizantjwtsecret";

    public String generateToken(String username) {

        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 600000))
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
                .compact();
    }
}