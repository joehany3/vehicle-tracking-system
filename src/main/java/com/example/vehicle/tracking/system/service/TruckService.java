package com.example.vehicle.tracking.system.service;
import com.example.vehicle.tracking.system.model.TruckModel;
import com.example.vehicle.tracking.system.repo.TruckRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TruckService {
    @Autowired
    TruckRepo truckRepo;

    public List<TruckModel> getAllTruck() {
        return truckRepo.findAll();
    }

    public Optional<TruckModel> getTruckById(long id) {
        return truckRepo.findById(id);
    }

    public TruckModel createTruck(TruckModel truck) {
        return truckRepo.save(truck);
    }
}
