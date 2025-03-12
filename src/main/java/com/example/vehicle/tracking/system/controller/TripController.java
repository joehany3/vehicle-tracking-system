package com.example.vehicle.tracking.system.controller;

import com.example.vehicle.tracking.system.model.TripModel;
import com.example.vehicle.tracking.system.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/trip")
public class TripController {
    @Autowired
    private TripService tripService;

    @GetMapping("/allTrip")
    public List<TripModel>  getAllTrip(){
        return (tripService.getAllTrip());
    }
}
