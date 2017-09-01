package com.sun.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    UserClient userClient;

    public String consumer1() {
        return userClient.if1();
    }

    public String consumer2() {
        return userClient.if2();
    }

    public String consumer3() {
        return userClient.if2();
    }

}