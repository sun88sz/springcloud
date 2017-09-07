package com.sun;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

@EnableZipkinStreamServer
@SpringBootApplication
public class ZipkinServerStreamES {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ZipkinServerStreamES.class).web(true).run(args);

        System.out.println("ZipkinServerStreamES Completed");
    }
}
