// EventController.java
package com.example.moetaz.Controller;

import com.example.moetaz.Entity.Event;
import com.example.moetaz.Repository.EventRepository;
import com.example.moetaz.Service.IServiceEvent;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/event")
public class EventController {
    private final IServiceEvent serviceEvent;
    private EventRepository eventRepository;


    @GetMapping("/retrieve-all-event")
    public String getEvents(Model model) {
        List<Event> listEvents = serviceEvent.retrieveAllEvents();
        model.addAttribute("events", listEvents);
        return "listEvents";
    }

    @GetMapping("/retrieve-event/{eventId}")
    public String retrieveEvent(@PathVariable("eventId") Long id, Model model) {
        Event event = serviceEvent.retrieveEvent(id);
        model.addAttribute("event", event);
        return "viewEvent";
    }

    @GetMapping("/add-event")
    public String addEventPage(Model model) {
        model.addAttribute("event", new Event());
        return "addEvent";
    }

    @PostMapping("/add-event-submit")
    public String addEvent(@ModelAttribute Event event) {
        serviceEvent.addEvent(event);
        return "redirect:/event/retrieve-all-event";
    }

    @PostMapping("/remove-event/{eventId}")
    public String removeEvent(@PathVariable("eventId") Long id) {
        serviceEvent.removeEvent(id);
        return "redirect:/event/retrieve-all-event";
    }

    @GetMapping("/update-event/{eventId}")
    public String editEvent(@PathVariable("eventId") Long id, Model model) {
        Event event = serviceEvent.retrieveEvent(id);
        model.addAttribute("event", event);
        return "editEvent";
    }

    @PutMapping("/update-event/{eventId}")
    public String updateEvent(@PathVariable("eventId") Long eventId, @ModelAttribute("event") Event updatedEvent) {
        Event existingEvent = serviceEvent.retrieveEvent(eventId);

        if (existingEvent != null) {
            existingEvent.setEventName(updatedEvent.getEventName());
            existingEvent.setEventDateTime(updatedEvent.getEventDateTime());

            serviceEvent.updateEvent(existingEvent);
        }

        return "redirect:/event/retrieve-all-event";
    }
}