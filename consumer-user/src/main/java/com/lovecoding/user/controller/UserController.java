package com.lovecoding.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/userBuyTicket")
    public String userBuyTicket(String name){
        System.out.println("-----userBuyTicket-----");
        return name + "购买了" + restTemplate.getForObject("http://PROVIDER-TICKET/getBuyTicket" , String.class);
    }
}
