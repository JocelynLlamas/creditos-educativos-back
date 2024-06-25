package pruebaTecnica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;
import pruebaTecnica.auth.AuthResponse;
import pruebaTecnica.auth.LoginRequest;
import pruebaTecnica.auth.RegisterRequest;
import pruebaTecnica.entities.User;
import pruebaTecnica.service.AuthService;
import pruebaTecnica.service.UserService;

@RestController
@RequestMapping("/auth")
// @RequiredArgsConstructor
public class AuthController {
    @Autowired
    private UserService userService;
    
    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody User user) {
        userService.createUser(user);
        return ResponseEntity.ok("User registered successfully");
    }

    @PostMapping("/login")
    public ResponseEntity<String> authenticateUser(@RequestBody User user) {
        // Implement JWT authentication logic here
        return ResponseEntity.ok("User authenticated successfully");
    }
}
