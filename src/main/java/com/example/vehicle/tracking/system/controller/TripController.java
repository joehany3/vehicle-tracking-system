package com.example.vehicle.tracking.system.controller;

import com.example.vehicle.tracking.system.model.TripModel;
import com.example.vehicle.tracking.system.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/trip")
public class TripController {
    @Autowired
    private TripService tripService;

    @PostMapping("/saveTrip")
    public TripModel saveTrip(@RequestBody TripModel trip) {
        return tripService.addTrip(trip);
    }


    @GetMapping("/allTrip")
    public List<TripModel>  getAllTrip(){
        return (tripService.getAllTrip());
    }

    @GetMapping("/byId")
    public TripModel getTripById(long id){
        return tripService.getTripById(id);
    }
}
