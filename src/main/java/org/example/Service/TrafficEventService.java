package org.example.Service;



import org.example.Model.TrafficEvent;
import org.example.Repository.TrafficEventRepository;

import java.util.List;

public class TrafficEventService {
    private final TrafficEventRepository repo;

    public TrafficEventService(TrafficEventRepository repo) {
        this.repo = repo;
    }

    //CRUD
    public void addEvent(TrafficEvent event) {
        repo.save(event);
    }

    public List<TrafficEvent> getAllEvents() {
        return repo.findAll();
    }

    public TrafficEvent getEventById(Integer id) {
        return repo.findById(id);
    }

    public void deleteEvent(Integer id) {
        repo.deleteById(id);
    }
}
