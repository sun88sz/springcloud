package com.sun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/es")
public class ESController {

    @Autowired
    private ElasticAccountInfoRepository repository;

    @PostMapping("")
    public AccountInfo save(@RequestBody AccountInfo accountInfo) {
        AccountInfo save = repository.save(accountInfo);
        return save;
    }

    @GetMapping("/{id}")
    public AccountInfo queryById(@PathVariable  String id){
        AccountInfo accountInfo = repository.findOne(id);
        return accountInfo;
    }

    @RequestMapping("/esAccountInfoName")
    public String queryAccountInfoByAccountName(String accountName, ModelMap modelMap){

        AccountInfo accountInfo = repository.findByAccountName(accountName);
        modelMap.addAttribute("esAccountInfo",accountInfo);
        modelMap.addAttribute("test_elastic","Test the elasticsearch");

        return "accountInfo";
    }
}