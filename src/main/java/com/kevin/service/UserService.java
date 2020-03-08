package com.kevin.service;

import com.kevin.domain.User;

public interface UserService {

    public User findByName(String name);

    public User findById(Integer id);
}
