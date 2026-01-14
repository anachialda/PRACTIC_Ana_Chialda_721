package org.example;

import org.example.Controller.FineController;
import org.example.Controller.TrafficEventController;
import org.example.Controller.VehicleController;
import org.example.Model.VehicleStatus;
import org.example.Model.VehicleType;
import org.example.Repository.FineRepository;
import org.example.Repository.TrafficEventRepository;
import org.example.Repository.VehicleRepository;
import org.example.Service.FineService;
import org.example.Service.TrafficEventService;
import org.example.Service.VehicleService;

import java.util.Scanner;

public class Main {
    static void main() {

        FineRepository fineRepository = new FineRepository();
        TrafficEventRepository trafficEventRepository = new TrafficEventRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();

        FineService fineService = new FineService(fineRepository);
        TrafficEventService trafficEventService = new TrafficEventService(trafficEventRepository);
        VehicleService vehicleService = new VehicleService(vehicleRepository);

        FineController fineController = new FineController(fineService);
        TrafficEventController trafficEventController = new TrafficEventController(trafficEventService);
        VehicleController vehicleController = new VehicleController(vehicleService);

        Scanner scnanner = new Scanner(System.in);

        System.out.println("Vehicles loaded:" + vehicleService.getAllVehicles().size());
        System.out.println("Events loaded:" + trafficEventService.getAllEvents().size());
        System.out.println("Fines loaded:" + fineService.getAllFines().size());

        System.out.println();

        vehicleController.showAllVehicles();

        System.out.println();

        //2
//        System.out.print("Enter Vehicle Type: ");
//        if (scnanner.hasNextLine()) {
//            String typeInput = scnanner.nextLine();
//            System.out.print("Enter Vehicle Status: ");
//            if (scnanner.hasNextLine()) {
//                String statusInput = scnanner.nextLine();
//
//                try {
//                    vehicleController.showFilteredVehicles(
//                            VehicleType.valueOf(typeInput.toUpperCase()),
//                            VehicleStatus.valueOf(statusInput.toUpperCase())
//                    );
//                } catch (IllegalArgumentException e) {
//                    System.out.println("Invalid input for vehicle type or status.");
//                }
//            } else {
//                System.out.println("Invalid input for vehicle status.");
//            }
//        } else {
//            System.out.println("Invalid input for vehicle type.");
//        }

        //3
        System.out.println();
        System.out.println("    Vehicles sorted: ");
        vehicleController.showSortedVehicles();

        //4
        System.out.println();
        vehicleController.saveSortedToFile();

        //5
        System.out.println();
        trafficEventController.showRiskScore();
    }
}
