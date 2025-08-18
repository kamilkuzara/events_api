package com.neueda.events_api.controller;

import com.neueda.events_api.entity.Event;
import com.neueda.events_api.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {
    @Autowired
    private EventService eventService;

    @GetMapping
    public List<Event> getAllEvents() {
        return eventService.getEvents();
    }

    @GetMapping("/{id}")
    public Event getEventById(@PathVariable int id) {
        return eventService.getEventById(id);
    }

    @PostMapping
    public void createEvent(@RequestBody Event newEvent) {
        eventService.createEvent(newEvent);
    }
}
