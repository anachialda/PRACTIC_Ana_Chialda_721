package org.example.Controller;

import org.example.Service.FineService;

public class FineController {
    private final FineService fineService;

    public FineController(FineService fineService) {
        this.fineService = fineService;
    }

    public void showAllFines() {
        fineService.getAllFines().forEach(System.out::println);
    }
}
