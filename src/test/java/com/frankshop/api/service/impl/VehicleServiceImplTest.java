package com.frankshop.api.service.impl;

import com.frankshop.api.domain.Vehicle;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class VehicleServiceImplTest extends BaseServiceTest<Vehicle, com.frankshop.api.entity.Vehicle> {

    @Autowired
    VehicleServiceImpl service;

    @Override
    public VehicleServiceImpl getService() {
        return service;
    }

    @BeforeEach
    public void init() {

    }

    @Override
    public Vehicle createObject(String id) {
        Vehicle v = new Vehicle();
        v.set_id(id);
        return v;
    }

}
