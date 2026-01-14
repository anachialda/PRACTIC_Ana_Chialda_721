package org.example.Repository;

import org.example.Model.TrafficEvent;

public class TrafficEventRepository extends InFileRepo<TrafficEvent> {
    public TrafficEventRepository() {
        super("events.json", TrafficEvent.class);
    }
}
