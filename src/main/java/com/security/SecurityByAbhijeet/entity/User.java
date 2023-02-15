package com.security.SecurityByAbhijeet.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class User {
    @Id
    private String userId;
    @Column(unique = true,nullable = false)
    private String email;
    private String name;
    private String password;
    private String role;
}
