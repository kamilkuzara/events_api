package com.neueda.events_api.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String venue ;
    private String date;
    private int numTicketsAvailable;
    private String artistName;

    public Event(String venue, String date, int numTicketsAvailable, String artistName) {
        this.venue = venue;
        this.date = date;
        this.numTicketsAvailable = numTicketsAvailable;
        this.artistName = artistName;
    }

    // default constructor, needed for JPA to work
    public Event(){

    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
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
}
