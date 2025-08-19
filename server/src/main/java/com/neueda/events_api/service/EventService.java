package com.neueda.events_api.service;

import com.neueda.events_api.entity.Event;

import java.util.List;

public interface EventService {
    public List<Event> getEvents();
    public Event getEventById(Integer id);
    public void createEvent(Event event);

    /*
    @return List<Event> a list of events where the name contains the value provided in @param name case insensitive
     */
    public List<Event> getEventsByName(String name);

    /*
    @return List<Event> a list of events where the artistName contains the value provided in @param artistName, case insensitive
     */
    public List<Event> getEventsByArtistName(String artistName);
}
