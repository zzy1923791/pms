package com.lacemile.controller;

import com.lacemile.model.sys.user.User;
import com.lacemile.service.sys.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * Created by yuume on 17/1/20.
 */
@RestController
public class UserRest {

    @Autowired
    UserService userService;

    @RequestMapping("/get_user")
    public User user(@RequestParam int i_user_key){
        User u = userService.get_user(i_user_key);
        return u;
    }

    @RequestMapping("/get_user1")
    public String jsonOut(@RequestParam String jsonIn) throws IOException {
        return userService.jsonGetUsers(jsonIn);
    }
}

