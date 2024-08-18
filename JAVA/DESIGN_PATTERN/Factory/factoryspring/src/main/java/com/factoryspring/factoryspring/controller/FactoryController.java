package com.factoryspring.factoryspring.controller;

import com.factoryspring.factoryspring.services.VehicleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactoryController {
    @Autowired
    VehicleServiceImpl vservice;

    @GetMapping("/vehicle/{type}")
    public String getVehicle(@PathVariable("type") String type) {
        System.out.println("type: "+type);
        return vservice.getVehicleDetails(type);
    }
}
