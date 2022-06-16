package com.example.springsecurity.repo;

import com.example.springsecurity.domin.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
