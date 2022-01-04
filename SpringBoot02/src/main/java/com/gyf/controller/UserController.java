package com.gyf.controller;


import com.gyf.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private Person person;

    @GetMapping("/test")
    public String test(){
        return person.toString();
    }
}
