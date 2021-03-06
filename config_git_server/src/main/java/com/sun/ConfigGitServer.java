package com.sun;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 例如访问 http://localhost:7100/git_client/pro/dev
 */
@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigGitServer {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigGitServer.class).web(true).run(args);

        System.out.println("ConfigServer Completed");
    }
}
