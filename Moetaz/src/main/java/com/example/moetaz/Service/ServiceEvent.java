package com.example.moetaz.Service;

import com.example.moetaz.Entity.Event;
import com.example.moetaz.Repository.EventRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ServiceEvent implements IServiceEvent{
    EventRepository eventRepository;


    @Override
    public List<Event> retrieveAllEvents() {
        return eventRepository.findAll();
    }

    @Override
    public Event addEvent(Event event) {
        return eventRepository.save(event);
    }

    @Override
    public Event updateEvent(Event event) {
        return eventRepository.save(event);
    }

    @Override
    public Event retrieveEvent(Long id) {
        return eventRepository.findById(id).get();
    }

    @Override
    public void removeEvent(Long id) {
        eventRepository.deleteById(id);
    }
}
