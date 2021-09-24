package com.wade.homepage.service;

import com.wade.homepage.model.User;

public interface UserService {
    User findByUsername(String username);

    void save(User user);
}
