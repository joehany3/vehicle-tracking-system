package com.example.vehicle.tracking.system.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class TruckModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long truckId;
    private String truckNumber;
    private String truckType;
    private String manufactureYear;
    private double capacity;


    @OneToMany(mappedBy = "truck", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TripModel> trips;


}
