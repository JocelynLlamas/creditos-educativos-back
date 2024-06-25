package pruebaTecnica.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import pruebaTecnica.auth.AuthResponse;
import pruebaTecnica.auth.LoginRequest;
import pruebaTecnica.auth.RegisterRequest;

@Service
@RequiredArgsConstructor
public class AuthService {
    // AUTH METHODS
    public static AuthResponse login(LoginRequest request) {
        return null;
    }

    public static AuthResponse register(RegisterRequest request) {
        return null;
    }

}
