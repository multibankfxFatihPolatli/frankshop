package com.frankshop.api.dao.impl;

import com.frankshop.api.entity.Warehouse;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class WarehouseDaoImplTest extends BaseDaoTest<Warehouse> {

    @Autowired
    WarehouseDaoImpl dao;

    @Override
    public WarehouseDaoImpl getDao() {
        return dao;
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
