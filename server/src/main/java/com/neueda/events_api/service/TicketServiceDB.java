package com.neueda.events_api.service;


import com.neueda.events_api.entity.Ticket;
import com.neueda.events_api.entity.TicketRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@Profile("db")
public class TicketServiceDB implements TicketService {
    private TicketRepository ticketRepository;

    public TicketServiceDB(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }
}
