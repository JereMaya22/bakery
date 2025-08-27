package com.paning.get_by_id_user.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paning.get_by_id_user.modelDto.ShowUser;
import com.paning.get_by_id_user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService UserService;
    public UserController(UserService UserService){
        this.UserService = UserService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ShowUser> getByIdUser(@PathVariable Long id){
        return ResponseEntity.ok(UserService.getByIdUser(id));
    }

}
