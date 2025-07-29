package org.example.resources;

import org.example.dto.LoginDTO;
import org.example.dto.JwtResponse;
import org.example.services.UserDetailsServiceImpl;
import org.example.services.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.*;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {

    @Autowired
    private AuthenticationManager authManager;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginDTO loginDTO) {
        try {
            authManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            loginDTO.getUsername(), loginDTO.getPassword()
                    )
            );

            UserDetails userDetails = userDetailsService.loadUserByUsername(loginDTO.getUsername());
            String token = jwtUtil.generateToken(userDetails);

            return ResponseEntity.ok(new JwtResponse(token));
        } catch (AuthenticationException e) {
            return ResponseEntity.status(401).body("Credenciais inválidas");
        }
    }
}
