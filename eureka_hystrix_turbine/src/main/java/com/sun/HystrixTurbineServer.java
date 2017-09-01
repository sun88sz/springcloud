package com.sun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableTurbine
@EnableDiscoveryClient
@SpringBootApplication
public class HystrixTurbineServer {

    public static void main(String[] args) {
//        new SpringApplicationBuilder(HystrixTurbineServer.class).run(args);

        SpringApplication.run(HystrixTurbineServer.class, args);

        System.out.println("HystrixTurbineServer Completed");
    }
}
