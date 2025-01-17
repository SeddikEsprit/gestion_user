package org.example.userprod.controller;


import org.example.userprod.service.UserDetailsServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/user/admin")
public class UserController {
    @Autowired
    private UserDetailsServiceImp userDetailsServiceImp;

    @GetMapping("/deleteUser/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Integer id){
        return ResponseEntity.ok(userDetailsServiceImp.deleteUser(id));
    }
}
