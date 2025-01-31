package com.SesoverApp.Sesover.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SesoverApp.Sesover.Services.AuthService;
import com.SesoverApp.Sesover.entities.AuthRequest;
import com.SesoverApp.Sesover.entities.AuthResponse;
import com.SesoverApp.Sesover.entities.RegisterRequest;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class AuthController {

	private final AuthService service;

	@PostMapping("/register")
	public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest request) {
		return ResponseEntity.ok(service.register(request));
	}

	@PostMapping("/login")
	public ResponseEntity<AuthResponse> authenticate(@RequestBody AuthRequest request) {
		return ResponseEntity.ok(service.authenticate(request));
	}

}