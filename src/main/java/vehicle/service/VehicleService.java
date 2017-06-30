package com.vehicle.service;

import com.vehicle.entity.Vehicle;

import java.util.List;

/**
 * Created by sai on 6/25/17.
 */
public interface VehicleService {

    List<Vehicle> displayAll();

    Vehicle displayOne(String vin);

    Vehicle create(Vehicle vh);

    Vehicle update(String vin, Vehicle vh);

    void delete(String vin);
}
