package com.factoryspring.factoryspring.factoryimpl;

import com.factoryspring.factoryspring.vehicles.Bike;
import com.factoryspring.factoryspring.vehicles.Car;
import com.factoryspring.factoryspring.vehicles.Vehicle;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
public class VehicleFactory {
    @Autowired
    Car c;
    @Autowired
    Bike b;
    private static final Map<String, Vehicle> handler = new HashMap<>();
    @PostConstruct
    private Map<String, Vehicle> getObject() {
        handler.put("BIKE", b);
        handler.put("CAR", c);
        return handler;
    }
    public static Vehicle getVehicleObject(String type) throws Exception{
        System.out.println(handler);
        System.out.println(handler.get(type));
        //return Optional.ofNullable(handler.get(type)).orElseThrow(IllegalArgumentException::new);
        return handler.get(type);
    }
}
