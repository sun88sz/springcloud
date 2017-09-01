package com.sun.service;

import org.springframework.stereotype.Service;

@Service
public class UserClientFallback implements UserClient {
    @Override
    public String test() {
        return null;
    }

    @Override
    public String if1() {
        return "if1_fallback";
    }

    @Override
    public String if2() {
        return "if2_fallback";
    }
}
