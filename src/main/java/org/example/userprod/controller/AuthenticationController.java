package org.example.userprod.controller;


import jakarta.servlet.http.HttpServletRequest;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.example.userprod.model.AuthenticationResponse;
import org.example.userprod.model.User;
import org.example.userprod.service.AuthenticationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@CrossOrigin("*")
@RequestMapping("/user/auth")
public class AuthenticationController {
    private final AuthenticationService authService;


    public AuthenticationController(AuthenticationService authService) {
        this.authService = authService;
    }


    @PostMapping("/addUser")
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody User request
    ) {
        return ResponseEntity.ok(authService.register(request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthenticationResponse> login(
            @RequestBody User request
    ) {
        return ResponseEntity.ok(authService.authenticate(request));
    }
    @GetMapping("/all")
    public ResponseEntity<?> getAllUsers(@NonNull HttpServletRequest request) {
        String authHeader=request.getHeader("Authorization");
        String token=authHeader.substring(7);
        //   System.out.println("token"+token);
        return ResponseEntity.ok(authService.loadAllUsers(token));

    }

}
