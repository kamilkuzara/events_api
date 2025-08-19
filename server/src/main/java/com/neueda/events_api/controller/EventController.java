package com.neueda.events_api.controller;

import com.neueda.events_api.entity.Event;
import com.neueda.events_api.service.EventService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @PostMapping
    public void createEvent(@RequestBody Event newEvent) {
        eventService.createEvent(newEvent);
    }
}
