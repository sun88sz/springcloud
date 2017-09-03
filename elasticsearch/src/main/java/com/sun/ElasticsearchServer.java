package com.sun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;

@SpringBootApplication
public class ElasticsearchServer {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ElasticsearchServer.class).web(true).run(args);
    }
}
