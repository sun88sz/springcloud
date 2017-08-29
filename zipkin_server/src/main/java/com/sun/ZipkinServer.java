package com.sun;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import zipkin.server.EnableZipkinServer;

@EnableZipkinServer
@SpringBootApplication
public class ZipkinServer {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ZipkinServer.class).web(true).run(args);
    }
}
