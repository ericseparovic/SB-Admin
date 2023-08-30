package com.sbadmin.sbadmin.controllers;

import com.sbadmin.sbadmin.models.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping(value = "user/{id}")
    public User getUser(@PathVariable Long id){
        User user = new User();
        user.setId(id);
        user.setName("Eric");
        user.setLastName("Separovic");
        user.setEmail("ericseparovic07@gmail.com");
        user.setPhone("092094208");
        return user;
    }

    @RequestMapping(value = "modifyUser")
    public User modifyUser(){
        User user = new User();
        user.setName("Eric");
        user.setLastName("Separovic");
        user.setEmail("ericseparovic07@gmail.com");
        user.setPhone("092094208");
        return user;
    }

    @RequestMapping(value = "deleteUser")
    public User deleteUser(){
        User user = new User();
        user.setName("Eric");
        user.setLastName("Separovic");
        user.setEmail("ericseparovic07@gmail.com");
        user.setPhone("092094208");
        return user;
    }

    @RequestMapping(value = "searchUser")
    public User searchUser(){
        User user = new User();
        user.setName("Eric");
        user.setLastName("Separovic");
        user.setEmail("ericseparovic07@gmail.com");
        user.setPhone("092094208");
        return user;
    }
}
