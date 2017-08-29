package com.sun;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private Logger log = Logger.getLogger(getClass());

    @Autowired
    DiscoveryClient client;

    @GetMapping("/test")
    public String test() {
        log.info("eureka_client:UserController:test");

        return "test";
    }

    @RequestMapping(value = "/if1", method = RequestMethod.GET)
    public String if1() throws InterruptedException {

        log.info("eureka_client:UserController:if1");
        Thread.sleep(new Double(Math.random() * 20).longValue() * 1000);

        String services = "Services1: " + client.getServices();
        System.out.println(services);
        return services;
    }


    @RequestMapping(value = "/if2", method = RequestMethod.GET)
    public String if2() {
        log.info("eureka_client:UserController:if2");

        String services = "Services2: " + client.getServices();
        System.out.println(services);
        return services;
    }
}
