package com.security.SecurityByAbhijeet.impl;

import com.security.SecurityByAbhijeet.entity.User;
import com.security.SecurityByAbhijeet.repository.UserRepo;
import com.security.SecurityByAbhijeet.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public List<User> getAllData() {
        return userRepo.findAll();
    }

    @Override
    public Optional<User> getData(String id) {
        return userRepo.findById(id);
    }

    @Override
    public User saveData(User user) {
        user.setUserId(UUID.randomUUID().toString());
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        return userRepo.save(user);
    }
}
