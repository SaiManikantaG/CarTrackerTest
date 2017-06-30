package com.vehicle.repository;

import com.vehicle.entity.Vehicle;

import java.util.List;

/**
 * Created by sai on 6/25/17.
 */


public interface VehicleRepository {

    List<Vehicle> displayAll();

    Vehicle displayOne(String vin);

    Vehicle create(Vehicle vh);

    Vehicle update(Vehicle vh);

    void delete(Vehicle vh);

}
