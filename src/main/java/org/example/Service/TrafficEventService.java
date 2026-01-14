package org.example.Service;



import org.example.Model.EventType;
import org.example.Model.TrafficEvent;
import org.example.Repository.TrafficEventRepository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

    public int riskScore(TrafficEvent event) {
        int s = event.getSeverity();
        switch (event.getType()) {
            case SPEEDING:
                return s * 2;
            case RED_LIGHT:
                return s * 3;
            case ACCIDENT:
                return s * 5;
            case PRIORITY_PASS:
                return s * 1;
            default:
                return s;
        }
    }

    public void generateReport(String filename) throws IOException {
        Map<EventType, Long> counts = getAllEvents().stream()
                .collect(Collectors.groupingBy(TrafficEvent::getType, Collectors.counting()));

        List<String> lines = new ArrayList<>();

        counts.forEach((type, count) -> {
            lines.add(type + " -> " + count);
        });

        Files.write(Path.of(filename), lines);
    }
}
