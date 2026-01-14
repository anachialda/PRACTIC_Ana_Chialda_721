package org.example.Controller;

import org.example.Service.TrafficEventService;

import java.io.IOException;

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

    public void generateReport() {
        try {
            trafficEventService.generateReport("traffic_report.txt");
            System.out.println("Erstellt!");
        } catch (IOException e) {
            System.out.println("Fehler" + e.getMessage());
        }
    }
}
