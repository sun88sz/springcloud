package com.sun;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ElasticsearchServer {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ElasticsearchServer.class).web(true).run(args);

        System.out.println("ElasticsearchServer completed");
    }
}
