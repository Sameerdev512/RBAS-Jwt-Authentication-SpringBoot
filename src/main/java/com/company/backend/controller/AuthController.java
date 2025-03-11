package com.company.backend.controller;

import com.company.backend.dto.AuthRequest;
import com.company.backend.dto.RegisterRequest;
import com.company.backend.service.AuthService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public String register(@RequestBody RegisterRequest request) {
        return authService.register(request);
    }

    @PostMapping("/login")
    public String login(@RequestBody AuthRequest request) {
        System.out.println("request passed in mapping");
        return authService.authenticate(request);
    }
}
