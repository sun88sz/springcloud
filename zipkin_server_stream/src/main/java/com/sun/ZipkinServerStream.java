package com.sun;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import zipkin.server.EnableZipkinServer;

@EnableZipkinServer
@SpringBootApplication
public class ZipkinServerStream {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ZipkinServerStream.class).web(true).run(args);
    }
}
