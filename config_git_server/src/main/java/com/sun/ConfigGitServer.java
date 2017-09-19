package com.sun;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigGitServer {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigGitServer.class).web(true).run(args);

        System.out.println("ConfigServer Completed");
    }
}
