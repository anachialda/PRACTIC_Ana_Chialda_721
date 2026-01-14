package org.example.Model;

public class TrafficEvent {
    int id;
    int vehicleId;
    EventType type;
    int severity;
    int timeSlot;

    public TrafficEvent() {}

    public TrafficEvent(int id, int vehicleId, EventType type, int severity, int timeSlot) {
        this.id = id;
        this.vehicleId = vehicleId;
        this.type = type;
        this.severity = severity;
        this.timeSlot = timeSlot;
    }

    //Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getVehicleId() { return vehicleId; }
    public void setVehicleId(int vehicleId) { this.vehicleId = vehicleId; }

    public EventType getType() { return type; }
    public void setType(EventType type) { this.type = type; }

    public int getSeverity() { return severity; }
    public void setSeverity(int severity) { this.severity = severity; }

    public int getTimeSlot() { return timeSlot; }
    public void setTimeSlot(int timeSlot) { this.timeSlot = timeSlot; }
}
