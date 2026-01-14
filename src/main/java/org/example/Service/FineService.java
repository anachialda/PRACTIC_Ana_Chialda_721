package org.example.Service;

import org.example.Model.Fine;
import org.example.Repository.FineRepository;

import java.util.List;

public class FineService {
    private final FineRepository repo;

    public FineService(FineRepository repo) {
        this.repo = repo;
    }

    //CRUD
    public void addFine(Fine fine) {
        repo.save(fine);
    }

    public List<Fine> getAllFines() {
        return repo.findAll();
    }

    public Fine getFineById(Integer id) {
        return repo.findById(id);
    }

    public void deleteFine(Integer id) {
        repo.deleteById(id);
    }


}
