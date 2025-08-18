package com.neueda.events_api.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String id ;
    String venue ;
    String date;

    public Event() {

    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {}
    public String getDate() {
        return date;
    }
    public void setDate(String date) {}

    public Event(String id, String venue, String date) {
        this.id = id;
        this.venue = venue;
        this.date = date;
    }
}
