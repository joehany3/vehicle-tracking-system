package com.example.vehicle.tracking.system.controller;

import com.example.vehicle.tracking.system.model.TruckModel;
import com.example.vehicle.tracking.system.service.TruckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController("/truck")
public class TruckController {

    @Autowired
    TruckService truckService;

    @PostMapping("/truck")
    public TruckModel createTruck(@RequestBody TruckModel truck) {
        return truckService.createTruck(truck);
    }




//-----------------------------------------------------
    @GetMapping("allTruck")
    public List<TruckModel> getAllTruck(){
        return truckService.getAllTruck();
    }
//-------------------------------------------------------

    @GetMapping("/truckById")
    public Optional<TruckModel> getTruckById(@RequestParam Long id){
        return truckService.getTruckById(id);
    }
}
