package com.sun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoUserController {

    @Autowired
    UserClient userClient;

    @GetMapping("/consumer1")
    public String if1() {
        return userClient.if1();
    }

    @GetMapping("/consumer2")
    public String if2() {
        return userClient.if2();
    }
}