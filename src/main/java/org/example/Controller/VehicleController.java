package org.example.Controller;

import org.example.Model.Vehicle;
import org.example.Model.VehicleStatus;
import org.example.Model.VehicleType;
import org.example.Service.FineService;
import org.example.Service.VehicleService;

import java.io.IOException;
import java.util.List;

public class VehicleController {
    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    public void showAllVehicles() {
        vehicleService.getAllVehicles().forEach(System.out::println);
    }

    public void showFilteredVehicles(VehicleType type, VehicleStatus status) {
        List<Vehicle> filteredVehicles = vehicleService.findByTypAndStatus(type, status);
        filteredVehicles.forEach(System.out::println);
    }

    public void showSortedVehicles(){
        vehicleService.getSortedVehicles().forEach(System.out::println);
    }

    public void saveSortedToFile() {
        try {
            vehicleService.saveSortedVehiclesToFile("vehicles_sorted.txt");
            System.out.println("Gespeichert");
        } catch (IOException e) {
            System.out.println("Fehler beim Speichern: " + e.getMessage());
        }
    }

}
