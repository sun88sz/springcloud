package com.sun;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ApplicationClientSleuthStream {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ApplicationClientSleuthStream.class).web(true).run(args);

        System.out.println("ApplicationClientSleuthStream completed");
    }
}