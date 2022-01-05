package com.gyf.service;

import com.gyf.domain.Student;
import com.gyf.domain.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    User list(Integer id);

    List<User> listall();

    void add(User user);

    void remove(Integer id);

    void updata(User user);

    Map<String ,Object> getIdForUser(Integer id);

    Map<Integer,User> getNameForUser(String name);

    Student getIdByStudent(Integer id);
}
