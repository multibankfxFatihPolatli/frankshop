package com.frankshop.api.service.impl;

import com.frankshop.api.dao.BaseDao;
import com.frankshop.api.dao.VehicleDao;
import com.frankshop.api.domain.Vehicle;
import com.frankshop.api.mapper.BaseEntityMapper;
import com.frankshop.api.mapper.VehicleEntityMapper;
import com.frankshop.api.service.VehicleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class VehicleServiceImpl extends BaseServiceImpl<Vehicle, com.frankshop.api.entity.Vehicle>
        implements VehicleService {

    @Autowired
    private VehicleDao dao;

    @Autowired
    private VehicleEntityMapper mapper;

    @Override
    public BaseDao<com.frankshop.api.entity.Vehicle> getDao() {
        return dao;
    }

    @Override
    public BaseEntityMapper<Vehicle, com.frankshop.api.entity.Vehicle> getMapper() {
        return mapper;
    }

}
