package com.frankshop.api.service;

import com.frankshop.api.dao.BaseDao;
import com.frankshop.api.domain.Vehicle;
import com.frankshop.api.mapper.BaseEntityMapper;

public interface VehicleService extends BaseService<Vehicle, com.frankshop.api.entity.Vehicle> {

    public BaseDao<com.frankshop.api.entity.Vehicle> getDao();

    public BaseEntityMapper<Vehicle, com.frankshop.api.entity.Vehicle> getMapper();

}
