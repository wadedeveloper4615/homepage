package com.wade.homepage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wade.homepage.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
