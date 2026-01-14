package org.example.Controller;

import org.example.Service.FineService;
import org.example.Service.TrafficEventService;

public class TrafficEventController {
    private final TrafficEventService trafficEventService;

    public TrafficEventController(TrafficEventService trafficEventService) {
        this.trafficEventService = trafficEventService;
    }

    public void showAllEvents() {
        trafficEventService.getAllEvents().forEach(System.out::println);
    }
}
