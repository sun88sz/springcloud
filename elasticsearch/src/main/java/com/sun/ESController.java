package com.sun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/es")
public class ESController {

    @Autowired
    private ElasticAccountInfoRepository repository;


    @PostMapping("/")
    public AccountInfo testSaveArticleIndex() {
        AccountInfo accountInfo = new AccountInfo();
        AccountInfo save = repository.save(accountInfo);
        return save;
    }

    @GetMapping("/{id}")
    public String queryAccountInfo(@PathVariable  String id, ModelMap modelMap){

//        repository.findById()
//        AccountInfo accountInfo = repository.findById(id);
//        modelMap.addAttribute("esAccountInfo",accountInfo);
//        modelMap.addAttribute("test_elastic","Test the elasticsearch");

        return "accountInfo";
    }

    @RequestMapping("/esAccountInfoName")
    public String queryAccountInfoByAccountName(String accountName, ModelMap modelMap){

        AccountInfo accountInfo = repository.findByAccountName(accountName);
        modelMap.addAttribute("esAccountInfo",accountInfo);
        modelMap.addAttribute("test_elastic","Test the elasticsearch");

        return "accountInfo";
    }
}