package com.security.SecurityByAbhijeet.controller;

import com.security.SecurityByAbhijeet.entity.User;
import com.security.SecurityByAbhijeet.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping("/user")
    public List<User> getAllUser(){
        return userService.getAllData();
    }

    @GetMapping("/user/{id}")
    public Optional<User> getData(@PathVariable String id){
        return userService.getData(id);
    }

    @PostMapping("/user/add")
    public User saveData(@RequestBody User user){
        return userService.saveData(user);
    }
}
