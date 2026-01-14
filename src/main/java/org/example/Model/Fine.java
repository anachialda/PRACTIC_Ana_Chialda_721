package org.example.Model;

public class Fine {
    int id;
    int vehicleId;
    FineReason reason;
    int amount;
    int timeSlot;

    public Fine() {}

    public Fine(int id, int vehicleId, FineReason reason, int amount, int timeSlot) {
        this.id = id;
        this.vehicleId = vehicleId;
        this.reason = reason;
        this.amount = amount;
        this.timeSlot = timeSlot;
    }

    //Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getVehicleId() { return vehicleId; }
    public void setVehicleId(int vehicleId) { this.vehicleId = vehicleId; }

    public FineReason getReason() { return reason; }
    public void setReason(FineReason reason) { this.reason = reason; }

    public int getAmount() { return amount; }
    public void setAmount(int amount) { this.amount = amount; }

    public int getTimeSlot() { return timeSlot; }
    public void setTimeSlot(int timeSlot) { this.timeSlot = timeSlot;}
}
