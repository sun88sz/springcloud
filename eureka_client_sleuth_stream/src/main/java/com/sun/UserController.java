package com.sun;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private Logger log = Logger.getLogger(getClass());

    @Autowired
    DiscoveryClient client;

    @GetMapping("/test")
    public String test() {
        log.info("eureka-client-ss:UserController:test");

        return "test";
    }

    @RequestMapping(value = "/if1", method = RequestMethod.GET)
    public String if1() throws InterruptedException {

        log.info("eureka_client-ss:UserController:if1");

        String services = "Services1: " + client.getServices();
        Thread.sleep(new Double(Math.random() * 5).longValue() * 1000);
        System.out.println(services);
        return services;
    }


    @RequestMapping(value = "/if2", method = RequestMethod.GET)
    public String if2() {
        log.info("eureka_client-ss:UserController:if2");

        String services = "Services2: " + client.getServices();
        System.out.println(services);
        return services;
    }
}
