package com.neueda.events_api.entity;

public class Event {
    private int id;
    private String venue ;
    private String date;
    private int numTicketsAvailable;
    private String artistName;

    public int getId() {
        return id;
    }
    public void setId(int id) {
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

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public int getNumTicketsAvailable() {
        return numTicketsAvailable;
    }

    public void setNumTicketsAvailable(int numTicketsAvailable) {
        this.numTicketsAvailable = numTicketsAvailable;
    }

    public Event(int id, String venue, String date, int numTicketsAvailable, String artistName) {
        this.id = id;
        this.venue = venue;
        this.date = date;
        this.numTicketsAvailable = numTicketsAvailable;
        this.artistName = artistName;
    }
}
