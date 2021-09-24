package com.wade.homepage.service;

public interface SecurityService {
    void autoLogin(String username, String password);

    boolean isAuthenticated();
}
