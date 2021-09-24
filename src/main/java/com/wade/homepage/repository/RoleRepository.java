package com.wade.homepage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wade.homepage.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
