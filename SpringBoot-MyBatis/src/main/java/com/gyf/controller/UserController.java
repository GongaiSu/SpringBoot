package com.gyf.controller;


import com.gyf.domain.User;
import com.gyf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userServiceImpl;


    @GetMapping("/test")
    public User list(@RequestParam Integer id) {

        return userServiceImpl.list(id);
    }
    @GetMapping("/testall")
    public List<User> listAll() {
        return userServiceImpl.listall();
    }
    @GetMapping("/remove")
    public void remove(Integer id){
        userServiceImpl.remove(id);
    }

    @PostMapping("/add")
    public String add(User user){
        userServiceImpl.add(user);
        return "id=" + user.getId();
    }


}
