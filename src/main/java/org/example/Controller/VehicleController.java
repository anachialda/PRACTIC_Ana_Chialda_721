package org.example.Controller;

import org.example.Service.FineService;
import org.example.Service.VehicleService;

public class VehicleController {
    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    public void showAllFines() {
        vehicleService.getAllVehicles().forEach(System.out::println);
    }

}
