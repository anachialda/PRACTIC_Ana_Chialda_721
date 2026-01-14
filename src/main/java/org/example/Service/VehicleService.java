package org.example.Service;

import org.example.Model.Vehicle;
import org.example.Model.VehicleStatus;
import org.example.Model.VehicleType;
import org.example.Repository.VehicleRepository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class VehicleService {
    private final VehicleRepository repo;

    public VehicleService(VehicleRepository repo) {
        this.repo = repo;
    }

    //CRUD
    public void addVehicle(Vehicle vehicle) {
        repo.save(vehicle);
    }

    public List<Vehicle> getAllVehicles() {
        return repo.findAll();
    }

    public Vehicle getVehicleById(Integer id) {
        return repo.findById(id);
    }

    public void deleteVehicle(Integer id) {
        repo.deleteById(id);
    }

    //filtern
    public List<Vehicle> findByTypAndStatus(VehicleType type, VehicleStatus status) {
        return getAllVehicles().stream()

                .filter(t -> t.getType() == type)

                .filter(t -> t.getStatus() == status)
                .collect(Collectors.toList());
    }

    //sortieren
    public List<Vehicle> getSortedVehicles() {
        return getAllVehicles().stream()
                .sorted(Comparator.comparing(Vehicle::getOwnerCity).reversed()
                        .thenComparingInt(Vehicle::getId).reversed())
                .collect(Collectors.toList());
    }


}
