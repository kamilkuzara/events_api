package com.neueda.events_api.entity;

public class Ticket {
    String ticket_id ;
    String event_id ;
    double price ;

    public String getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(String ticket_id) {
        this.ticket_id = ticket_id;
    }

    public String getEvent_id() {
        return event_id;
    }

    public void setEvent_id(String event_id) {
        this.event_id = event_id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Ticket(String ticket_id, String event_id, double price) {
        this.ticket_id = ticket_id;
    }
}
