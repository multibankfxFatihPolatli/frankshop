package com.frankshop.api.dao.impl;

import com.frankshop.api.entity.Vehicle;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class VehicleDaoImplTest extends BaseDaoTest<Vehicle> {

    @Autowired
    VehicleDaoImpl dao;

    @Override
    public VehicleDaoImpl getDao() {
        return dao;
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
