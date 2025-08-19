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

    private String name;
    private String venue ;
    private String date;
    private int numTicketsAvailable;
    private String artistName;

    public Event(String name, String venue, String date, int numTicketsAvailable, String artistName) {
        this.name = name;
        this.venue = venue;
        this.date = date;
        this.numTicketsAvailable = numTicketsAvailable;
        this.artistName = artistName;
    }

    // default constructor, needed for JPA to work
    public Event(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
//        TODO: Update the method so that it parses the string into a data format
        this.date = date;
    }

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
