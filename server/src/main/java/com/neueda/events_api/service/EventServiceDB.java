package com.neueda.events_api.service;

import com.neueda.events_api.entity.Event;
import com.neueda.events_api.entity.EventRepository;

import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Service
@Profile("db")
public class EventServiceDB implements EventService {
    private final EventRepository eventRepository;

    public EventServiceDB(EventRepository eventRepository){
      this.eventRepository = eventRepository;
    }

    @Override
    public List<Event> getEvents(){
      return eventRepository.findAll();
    }

    @Override
    public Event getEventById(Integer id){
        // if id not found null will be returned
        return eventRepository.findById(id).orElse(null);
    }

    @Override
    public void createEvent(Event event){
      eventRepository.save(event);
    }
}
