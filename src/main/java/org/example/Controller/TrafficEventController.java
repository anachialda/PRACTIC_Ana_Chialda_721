package org.example.Controller;

import org.example.Service.TrafficEventService;

public class TrafficEventController {
    private final TrafficEventService trafficEventService;

    public TrafficEventController(TrafficEventService trafficEventService) {
        this.trafficEventService = trafficEventService;
    }

    public void showAllEvents() {
        trafficEventService.getAllEvents().forEach(System.out::println);
    }

    public void showRiskScore() {
        trafficEventService.getAllEvents().stream()
                .limit(5)
                .forEach(e -> {;
                    int computed = trafficEventService.riskScore(e);
                    System.out.println("Event " + e.getId() +
                            " -> severity=" + e.getSeverity() +
                            " -> riskScore=" + computed);
                });
    }
}
