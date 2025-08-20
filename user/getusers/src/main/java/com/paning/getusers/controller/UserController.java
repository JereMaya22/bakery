package com.paning.getusers.controller;

import com.paning.getusers.modeldto.UserShowDato;
import com.paning.getusers.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/users")
    public ResponseEntity<List<UserShowDato>> getAllUsers(){
        return ResponseEntity.ok(userService.getAllUsers());
    }
}
