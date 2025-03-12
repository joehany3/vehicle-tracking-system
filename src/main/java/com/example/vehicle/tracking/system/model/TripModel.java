package com.example.vehicle.tracking.system.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class TripModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long TripId;
    private String startLocation;
    private String endLocation;
    private String startTime;
    private String endTime;
    private double distance;


    @ManyToOne
    @JoinColumn(name = "truckId", nullable = false)
    @JsonIgnore
    private TruckModel truck;

    @OneToMany(mappedBy = "trip", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Shipment> shipments;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DRIVERID", nullable = false)
    private DriverModel driver;

}
