package com.sun;

import com.sun.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoUserController {

    private Logger log = Logger.getLogger(getClass());

    @Autowired
    private UserService userService;

    @GetMapping("/consumer1")
    public String consumer1() {
        log.info("eureka_consumer_feign_hystrix:consumer1");
        return userService.consumer1();
    }

    @GetMapping("/consumer2")
    public String consumer2() {
        log.info("eureka_consumer_feign_hystrix:consumer2");
        return userService.consumer2();
    }

    @GetMapping("/consumer3")
    public String consumer3() {
        log.info("eureka_consumer_feign_hystrix:consumer3");
        return userService.consumer3();
    }
}
