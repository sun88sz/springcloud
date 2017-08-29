package com.sun;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ApplicationStreamKafkaConsumer {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ApplicationStreamKafkaConsumer.class).web(true).run(args);
    }
}
