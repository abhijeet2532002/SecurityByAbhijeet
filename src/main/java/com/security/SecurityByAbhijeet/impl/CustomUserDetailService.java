package com.security.SecurityByAbhijeet.impl;

import com.security.SecurityByAbhijeet.entity.CustomUserDetail;
import com.security.SecurityByAbhijeet.entity.User;
import com.security.SecurityByAbhijeet.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepo.findByEmail(email);
        if(user!=null)
            return new CustomUserDetail(user);
        else
            return (UserDetails) new UsernameNotFoundException("Email not found pls enter valid email");
    }
}
