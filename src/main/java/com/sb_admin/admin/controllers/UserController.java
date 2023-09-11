package com.sb_admin.admin.controllers;

import com.sb_admin.admin.models.User;
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
        user.setEmail("ericseparovic@gmail.com");
        user.setPassword("1121212");
        user.setPhone("092094208");

        return user;
    }
}
