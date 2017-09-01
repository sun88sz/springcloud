package com.sun;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringCloudApplication
public class HystrixDashboardServer {
    public static void main(String[] args) {

        new SpringApplicationBuilder(HystrixDashboardServer.class).run(args);

        System.out.println("HystrixDashboardServer Completed");
    }
}
