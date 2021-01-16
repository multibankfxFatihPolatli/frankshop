package com.frankshop.api.dao.impl;

import com.frankshop.api.dao.WarehouseDao;
import com.frankshop.api.entity.Warehouse;
import com.frankshop.api.repository.BaseRepository;
import com.frankshop.api.repository.WarehouseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class WarehouseDaoImpl extends BaseDaoImpl<Warehouse> implements WarehouseDao {

    @Autowired
    private WarehouseRepository repository;

    @Override
    public BaseRepository<Warehouse> getRepository() {

        return repository;
    }
}
