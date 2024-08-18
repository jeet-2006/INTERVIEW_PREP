package com.factoryspring.factoryspring.services;

import com.factoryspring.factoryspring.factoryimpl.VehicleFactory;
import com.factoryspring.factoryspring.vehicles.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleServiceImpl implements  VehicleService{
    @Override
    public String getVehicleDetails(String type) {
        Vehicle v = null;
        try {
            v = VehicleFactory.getVehicleObject(type);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Vehicle: "+v);
        return v == null ? "Vehicle Not Found" : v.getVehicleInfo();
    }
}
