package com.factoryspring.factoryspring.vehicles;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
    @Override
    public String getVehicleInfo() {
        return "You got CAR";
    }
}
