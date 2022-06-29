package com.springboot.api.user.controller;

import com.google.gson.JsonObject;
import com.springboot.api.user.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    /*
     * user를 컨트롤할 수 있는 컨트롤러를 만들었다.
     * webpage를 return 하지 않고 User(Object)를 response body에 return 한다.
     */
    @GetMapping("/user")
    public Object getUser() {
        User user = User.builder().userId("bsc1234").name("baeseungchan").build();
        return user;

    }
}
