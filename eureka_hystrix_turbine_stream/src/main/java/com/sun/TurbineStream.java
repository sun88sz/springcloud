package com.sun;

import com.sun.customer.EnableTurbineStream;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import rx.subjects.PublishSubject;

import java.util.Map;


//@org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream
@EnableTurbineStream
@EnableDiscoveryClient
@SpringBootApplication
public class TurbineStream {

    public PublishSubject<Map<String, Object>> hystrixSubject() {
        return PublishSubject.create();
    }

    public String getA() {
        new ObservableTurbineTest(hystrixSubject()).a();
        return "1";
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(TurbineStream.class).run(args);

        System.out.println("TurbineStream Completed");
    }
}
