package com.neueda.events_api.controller;

import com.neueda.events_api.entity.Event;
import com.neueda.events_api.service.EventService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/events")
public class EventController {
    private final EventService eventService;

    public EventController(EventService eventService){
      this.eventService = eventService;
    }

    @GetMapping
    public List<Event> getAllEvents() {
        return eventService.getEvents();
    }

    @GetMapping("/{id}")
    public Event getEventById(@PathVariable int id) {
        return eventService.getEventById(id);
    }

    @GetMapping(params = "name")
    public List<Event> getEventsByName(@RequestParam String name) {
        return eventService.getEventsByName(name);
    }

    @GetMapping(params = "artist")
    public List<Event> getEventsByArtistName(@RequestParam String artist) {
        return eventService.getEventsByArtistName(artist);
    }

    @PostMapping
    public void createEvent(@RequestBody Event newEvent) {
        eventService.createEvent(newEvent);
    }


}
