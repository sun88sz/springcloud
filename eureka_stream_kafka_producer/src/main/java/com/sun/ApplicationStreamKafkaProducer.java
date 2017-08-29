package com.sun;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ApplicationStreamKafkaProducer {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ApplicationStreamKafkaProducer.class).web(true).run(args);
    }
}
