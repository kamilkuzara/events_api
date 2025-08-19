package com.neueda.events_api.entity;
import jakarta.persistence.*;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;
    private double price ;
    private String seatType;

    @ManyToOne
    @JoinColumn(name = "event", nullable = false)
    private Event event;

    @ManyToOne
    @JoinColumn(name = "ticketHolder", nullable = false)
    private Customer ticketHolder;

    public Ticket(Integer id, double price, String seatType, Event event,  Customer ticketHolder) {
        this.id = id;
        this.price = price;
        this.seatType = seatType;
        this.event = event;
        this.ticketHolder = ticketHolder;
    }

    public Ticket() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Customer getTicketHolder() {
        return ticketHolder;
    }

    public void setTicketHolder(Customer ticketHolder) {
        this.ticketHolder = ticketHolder;
    }
}
