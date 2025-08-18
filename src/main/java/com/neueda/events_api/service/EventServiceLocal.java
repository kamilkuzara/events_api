package com.neueda.events_api.service;

import com.neueda.events_api.entity.Event;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EventServiceLocal implements EventService{
    private final List<Event> events;

    public EventServiceLocal() {
        events = new ArrayList<>();
    }

    public List<Event> getEvents() {
        return events;
    }

    public Event getEventById(int id) {
        Optional<Event> e =  events.stream().filter(event -> event.getId() == id).findFirst();

        if(e.isPresent()){
            return e.get();
        }

        return null;
    }

    public void createEvent(Event event){
        events.add(event);
    }
}
