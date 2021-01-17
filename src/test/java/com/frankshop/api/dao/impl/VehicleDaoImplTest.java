package com.frankshop.api.dao.impl;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.List;

import com.frankshop.api.entity.Vehicle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class VehicleDaoImplTest {

    @Autowired
    VehicleDaoImpl dao;

    @BeforeEach
    public void init() {

    }

    @Test
    public void vehicleListSuccessfulList() {

        List<Vehicle> result = dao.list();

        assertFalse(result.isEmpty());
    }

}
