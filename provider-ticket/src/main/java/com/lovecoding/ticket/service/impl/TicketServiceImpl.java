package com.lovecoding.ticket.service.impl;


import com.lovecoding.ticket.service.TicketService;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService{


    @Override
    public String getTicket() {
        System.out.println("-----------8084--------------");
        return "《三国演义》";
    }
}
