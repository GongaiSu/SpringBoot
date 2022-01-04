package com.gyf.controller;


import com.gyf.domain.Persion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private Persion persion;

    @GetMapping("/test")
    public String test(){

        return "test"+persion.toString();
    }
}
