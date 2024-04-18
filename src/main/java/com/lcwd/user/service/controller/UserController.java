package com.lcwd.user.service.controller;

import com.lcwd.user.service.enties.User;
import com.lcwd.user.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
@Autowired
    private UserService userService;
@PostMapping
    public ResponseEntity<User> create(@RequestBody User user){
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.Saveuser(user));
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUser(){
    return ResponseEntity.ok(userService.getAllUser());
    }

    public ResponseEntity<User> getUserById(String userId){

    return ResponseEntity.ok(userService.getUser(userId));
    }
}
