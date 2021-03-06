package com.sun;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;
import zipkin.server.EnableZipkinServer;

@EnableZipkinStreamServer
@SpringBootApplication
public class ZipkinServerStream {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ZipkinServerStream.class).web(true).run(args);


        System.out.println("ZipkinServerStream Completed");
    }
}
