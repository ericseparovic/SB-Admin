package com.sb_admin.admin.controllers;

import com.sb_admin.admin.models.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @RequestMapping(value = "user/{id}")
    public User getUser(@PathVariable Integer id){
        User user = new User();
        user.setId(id);
        user.setName("Eric");
        user.setLastName("Separovic");
        user.setEmail("ericseparovic@gmail.com");
        user.setPassword("1121212");
        user.setPhone("092094208");

        return user;
    }

    @RequestMapping(value = "user")
    public List<User> getUser(){

        List<User> users = new ArrayList<>();
        User user1 = new User();
        user1.setId(1);
        user1.setName("Eric");
        user1.setLastName("Separovic");
        user1.setEmail("ericseparovic@gmail.com");
        user1.setPassword("1121212");
        user1.setPhone("092094208");

        User user2 = new User();
        user2.setId(2);
        user2.setName("JUan");
        user2.setLastName("Separovic");
        user2.setEmail("ericseparovic@gmail.com");
        user2.setPassword("1121212");
        user2.setPhone("092094208");


        User user3 = new User();
        user3.setId(3);
        user3.setName("Marcelo");
        user3.setLastName("Separovic");
        user3.setEmail("ericseparovic@gmail.com");
        user3.setPassword("1121212");
        user3.setPhone("092094208");

        users.add(user1);
        users.add(user2);
        users.add(user3);

        return users;
    }

    @RequestMapping(value = "user/5")
    public User edit(@PathVariable Integer id){
        User user = new User();
        user.setId(id);
        user.setName("Eric");
        user.setLastName("Separovic");
        user.setEmail("ericseparovic@gmail.com");
        user.setPassword("1121212");
        user.setPhone("092094208");

        return user;
    }
    @RequestMapping(value = "user/7")
    public User delete(@PathVariable Integer id){
        User user = new User();
        user.setId(id);
        user.setName("Eric");
        user.setLastName("Separovic");
        user.setEmail("ericseparovic@gmail.com");
        user.setPassword("1121212");
        user.setPhone("092094208");

        return user;
    }

    @RequestMapping(value = "user/ñ")
    public User search(@PathVariable Integer id){
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
