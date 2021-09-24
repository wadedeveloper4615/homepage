package com.wade.homepage.dto;

import java.util.HashSet;

import com.wade.homepage.model.Role;
import com.wade.homepage.model.User;

public class UserRegistrationDto {
    private String username;
    private String password;
    private String passwordConfirm;
    private Role role;

    public UserRegistrationDto() {
        super();
    }

    public UserRegistrationDto(String username, String password, String passwordConfirm, Role role) {
        super();
        this.username = username;
        this.password = password;
        this.passwordConfirm = passwordConfirm;
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public Role getRole() {
        return role;
    }

    public User getUser() {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setPasswordConfirm(passwordConfirm);
        HashSet<Role> hashSet = new HashSet<>();
        hashSet.add(role);
        user.setRoles(hashSet);
        return user;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
