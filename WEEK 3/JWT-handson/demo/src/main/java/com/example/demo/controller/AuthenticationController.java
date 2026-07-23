package com.example.demo.controller;

import com.example.demo.model.AuthenticationRequest;
import com.example.demo.model.AuthenticationResponse;
import com.example.demo.util.JwtUtil;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthenticationController {

    private JwtUtil jwtUtil = new JwtUtil();

    @PostMapping("/authenticate")
    public AuthenticationResponse authenticate(@RequestBody AuthenticationRequest request) {

        if ("user".equals(request.getUsername()) &&
                "password".equals(request.getPassword())) {

            String token = jwtUtil.generateToken(request.getUsername());
            return new AuthenticationResponse(token);
        }

        throw new RuntimeException("Invalid Username or Password");
    }
}