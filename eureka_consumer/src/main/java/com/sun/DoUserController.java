package com.sun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DoUserController {

    /**
     * 我们注入了LoadBalancerClient和RestTemplate，并在/consumer接口的实现中，
     * 先通过loadBalancerClient的choose函数来负载均衡的选出一个eureka-client的服务实例，
     * 这个服务实例的基本信息存储在ServiceInstance中，然后通过这些对象中的信息拼接出访问接口的详细地址，
     * 最后再利用RestTemplate对象实现对服务提供者接口的调用。
     */
    @Autowired
    LoadBalancerClient loadBalancerClient;
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/consumer")
    public String consumer() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-client");
        String url = "http://" + "localhost" + ":" + serviceInstance.getPort() + "/user/if1";
        System.out.println(url);
        return restTemplate.getForObject(url, String.class);
    }
}