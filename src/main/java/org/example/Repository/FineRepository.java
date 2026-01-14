package org.example.Repository;

import org.example.Model.Fine;

public class FineRepository extends InFileRepo<Fine> {
    public FineRepository() {
        super("fines.json", Fine.class);
    }
}
