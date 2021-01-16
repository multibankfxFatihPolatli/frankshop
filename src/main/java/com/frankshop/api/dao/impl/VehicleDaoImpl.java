package com.frankshop.api.dao.impl;

import com.frankshop.api.dao.VehicleDao;
import com.frankshop.api.entity.Vehicle;
import com.frankshop.api.repository.BaseRepository;
import com.frankshop.api.repository.VehicleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class VehicleDaoImpl extends BaseDaoImpl<Vehicle> implements VehicleDao {

    @Autowired
    private VehicleRepository repository;

    @Override
    public BaseRepository<Vehicle> getRepository() {

        return repository;
    }
}
