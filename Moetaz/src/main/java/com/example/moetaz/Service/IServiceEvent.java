package com.example.moetaz.Service;

import com.example.moetaz.Entity.Event;

import java.util.List;

public interface IServiceEvent {
    List<Event> retrieveAllEvents();

    Event addEvent(Event event);

    Event updateEvent(Event event);

    Event retrieveEvent(Long id);

    void removeEvent(Long id);
}
