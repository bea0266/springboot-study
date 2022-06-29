package com.springboot.api.user.controller;

import com.google.gson.JsonObject;
import com.springboot.api.user.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/user")
    public Object getUser() {
        User user = User.builder().id("bsc1234").name("baeseungchan").build();
        return user;
    }
}
