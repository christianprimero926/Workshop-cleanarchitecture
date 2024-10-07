package com.co.ias.cdop.cleanarchitecture.controller;

import com.co.ias.cdop.cleanarchitecture.model.User;
import com.co.ias.cdop.cleanarchitecture.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @PostMapping
    public ResponseEntity<String> createUser(@RequestBody User user){
        userService.createUser(user);
        return new ResponseEntity<>("User created", HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<User>> getUsers(){
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }
}
