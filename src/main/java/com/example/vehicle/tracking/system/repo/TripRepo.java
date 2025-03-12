package com.example.vehicle.tracking.system.repo;

import com.example.vehicle.tracking.system.model.TripModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TripRepo extends JpaRepository<TripModel, Long> {

}
