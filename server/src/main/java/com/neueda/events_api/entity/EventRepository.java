package com.neueda.events_api.entity;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventRepository extends JpaRepository<Event, Integer>{
    public List<Event> findByNameContainingIgnoreCase(String name);
    public List<Event> findByArtistNameContainingIgnoreCase(String artistName);
}
