package com.example.vehicle.tracking.system.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class DriverModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int driverID;
    private String driverName;
    private String licenseNumber;
    private String contactNumber;

    @OneToMany(mappedBy = "driver", cascade = CascadeType.ALL)
    private List<TripModel> trips;

}
