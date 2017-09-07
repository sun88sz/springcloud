package com.sun;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ClientSleuthStream {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ClientSleuthStream.class).web(true).run(args);

        System.out.println("ClientSleuthStream completed");
    }
}