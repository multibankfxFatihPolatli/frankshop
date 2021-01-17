package com.frankshop.api.service.impl;

import com.frankshop.api.domain.Warehouse;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class WarehouseServiceImplTest extends BaseServiceTest<Warehouse, com.frankshop.api.entity.Warehouse> {

    @Autowired
    WarehouseServiceImpl service;

    @Override
    public WarehouseServiceImpl getService() {
        return service;
    }

    @BeforeEach
    public void init() {

    }

    @Override
    public Warehouse createObject(String id) {
    
        Warehouse v = new Warehouse();
        v.setId(id);
        return v;
    }

}
