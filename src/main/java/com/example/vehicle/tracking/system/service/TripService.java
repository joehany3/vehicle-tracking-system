package com.example.vehicle.tracking.system.service;

import com.example.vehicle.tracking.system.model.TripModel;
import com.example.vehicle.tracking.system.repo.TripRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TripService {
    @Autowired
    private TripRepo tripRepo;


    public List<TripModel> getAllTrip() {
        return tripRepo.findAll();
    }


    public TripModel getTripById(long id) {
        return tripRepo.findById(id);
    }

    public TripModel addTrip(TripModel trip) {
        return tripRepo.save(trip);
    }
}
