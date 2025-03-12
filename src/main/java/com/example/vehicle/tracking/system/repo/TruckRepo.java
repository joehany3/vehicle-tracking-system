package com.example.vehicle.tracking.system.repo;

import com.example.vehicle.tracking.system.model.TripModel;
import com.example.vehicle.tracking.system.model.TruckModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TruckRepo extends JpaRepository<TruckModel, Long> {
//
//    List<TripModel> findBytruckId(long id);
//    List<TripModel> findByTruckNumber(String truckNumber);
}
