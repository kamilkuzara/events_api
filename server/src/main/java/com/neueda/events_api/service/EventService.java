package com.neueda.events_api.service;

import com.neueda.events_api.entity.Event;

import java.util.List;

public interface EventService {
    public List<Event> getEvents();
    public Event getEventById(Integer id);
    public void createEvent(Event event);
}
