package com.neueda.events_api.entity;

public class Event {
    String id ;
    String venue ;
    String date;

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
