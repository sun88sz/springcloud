package com.sun.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Feign已经使用了Ribbon，所以如果你使用了@FeignClient，Riboon也同样被应用了。
 */
@FeignClient(name = "eureka-client", fallback = UserClientFallback.class)
public interface UserClient {

    @GetMapping("/user/test")
    String test();

    @GetMapping("/user/if1")
    String if1();

    @GetMapping("/user/if2")
    String if2();
}