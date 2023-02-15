package com.security.SecurityByAbhijeet.repository;

import com.security.SecurityByAbhijeet.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,String> {
    User findByEmail(String email);
}
