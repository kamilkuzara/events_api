package com.neueda.events_api.service;

import com.neueda.events_api.entity.Event;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Profile;

import java.util.*;

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

        if(e.isPresent()){
            return e.get();
        }

        return null;
    }

    public void createEvent(Event event){
        events.add(event);
    }
}
