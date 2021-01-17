package com.frankshop.api.service.impl;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.List;

import com.frankshop.api.domain.Vehicle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class VehicleServiceImplTest {

    @Autowired
    VehicleServiceImpl service;

    @BeforeEach
    public void init() {

    }

    @Test
    public void vehicleListSuccessfulList() {

        List<Vehicle> result = service.list();

        assertFalse(result.isEmpty());
    }

}
