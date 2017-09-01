package com.sun;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

//@SpringCloudApplication
@EnableFeignClients
@EnableCircuitBreaker
@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerFeignHystrixStream {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConsumerFeignHystrixStream.class).web(true).run(args);

        System.out.println("ConsumerFeignHystrixStream Completed");
    }
}
