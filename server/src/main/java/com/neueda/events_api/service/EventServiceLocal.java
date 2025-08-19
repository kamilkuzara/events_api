package com.neueda.events_api.service;

import com.neueda.events_api.entity.Event;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Profile;

import java.util.*;

import static java.util.stream.Collectors.toList;

@Service
@Profile("local")
public class EventServiceLocal implements EventService{
    private final List<Event> events;

    public EventServiceLocal(List<Event> events) {
        this.events = events;
    }

    public List<Event> getEvents() {
        return events;
    }

    public Event getEventById(Integer id) {
        Optional<Event> e =  events.stream().filter(event -> event.getId().equals(id)).findFirst();

        return e.orElse(null);
    }

    public List<Event> getEventsByName(String name){
        return events.stream().filter(event -> event.getName().toLowerCase().contains(name.toLowerCase())).collect(toList());
    }

    public List<Event> getEventsByArtistName(String artistName){
        return events.stream().filter(event -> event.getArtistName().toLowerCase().contains(artistName.toLowerCase())).collect(toList());
    }

    public void createEvent(Event event){
        events.add(event);
    }
}
