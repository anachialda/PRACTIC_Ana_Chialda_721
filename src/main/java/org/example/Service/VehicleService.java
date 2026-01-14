package org.example.Service;

import org.example.Model.Vehicle;
import org.example.Repository.VehicleRepository;

import java.util.List;

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


}
