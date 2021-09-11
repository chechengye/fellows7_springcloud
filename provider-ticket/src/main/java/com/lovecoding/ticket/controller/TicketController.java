package com.lovecoding.ticket.controller;

import com.lovecoding.ticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {


    @Autowired
    TicketService ticketService;

    @GetMapping("/getBuyTicket")
    public String getBuyTicket(){
        return ticketService.getTicket();
    }
}
