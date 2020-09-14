package com.example.multisource.controller;

import com.example.multisource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/getUserInfo")
    public Map<String, Object> getUserInfo(@RequestParam int id) {
        return userService.getUserInfo(id);
    }
}
