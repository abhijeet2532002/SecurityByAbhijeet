package com.security.SecurityByAbhijeet.service;

import com.security.SecurityByAbhijeet.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
    //Get all user data
    List<User> getAllData();
    //Get user data
    Optional<User> getData(String id);
    //Add user data
    User saveData(User user);

}
