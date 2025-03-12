package com.example.vehicle.tracking.system.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Shipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int shipmentID;
    private String shipmentType;
    private double weight;
    private String description;

    @ManyToOne
    @JoinColumn(name = "TripID", nullable = false)
    private TripModel trip;

}
