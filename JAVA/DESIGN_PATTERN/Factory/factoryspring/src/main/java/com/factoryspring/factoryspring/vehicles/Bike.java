package com.factoryspring.factoryspring.vehicles;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
    @Override
    public String getVehicleInfo() {
        return "You got BIKE";
    }
}
