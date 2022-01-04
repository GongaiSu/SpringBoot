package com.gyf.service;

import com.gyf.domain.User;

import java.util.List;

public interface UserService {
    User list(Integer id);

    List<User> listall();

    void add(User user);

    void remove(Integer id);
}
