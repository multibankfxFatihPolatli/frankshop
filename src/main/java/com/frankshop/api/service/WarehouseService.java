package com.frankshop.api.service;

import com.frankshop.api.dao.BaseDao;
import com.frankshop.api.domain.Warehouse;
import com.frankshop.api.mapper.BaseEntityMapper;

public interface WarehouseService extends BaseService<Warehouse, com.frankshop.api.entity.Warehouse> {

    public BaseDao<com.frankshop.api.entity.Warehouse> getDao();

    public BaseEntityMapper<Warehouse, com.frankshop.api.entity.Warehouse> getMapper();

}
