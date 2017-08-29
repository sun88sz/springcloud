package com.sun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProducerController {
    
    @Autowired
    private SendService service;
    
    @GetMapping(value = "/send/{msg}")
    public void send(@PathVariable("msg") String msg){
        service.sendMessage(msg);
    }
    
}