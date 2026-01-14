package org.example.Repository;

import org.example.Model.Vehicle;

public class VehicleRepository extends InFileRepo<Vehicle> {
    public VehicleRepository() {
        super("vehicles.json", Vehicle.class);
    }
}
