package org.example;

import org.example.Controller.FineController;
import org.example.Controller.TrafficEventController;
import org.example.Controller.VehicleController;
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



    }
}
