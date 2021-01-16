package com.frankshop.api.service.impl;

import com.frankshop.api.dao.BaseDao;
import com.frankshop.api.dao.WarehouseDao;
import com.frankshop.api.domain.Warehouse;
import com.frankshop.api.mapper.BaseEntityMapper;
import com.frankshop.api.mapper.WarehouseEntityMapper;
import com.frankshop.api.service.WarehouseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class WarehouseServiceImpl extends BaseServiceImpl<Warehouse, com.frankshop.api.entity.Warehouse>
        implements WarehouseService {

    @Autowired
    private WarehouseDao dao;

    @Autowired
    private WarehouseEntityMapper mapper;

    @Override
    public BaseDao<com.frankshop.api.entity.Warehouse> getDao() {
        return dao;
    }

    @Override
    public BaseEntityMapper<Warehouse, com.frankshop.api.entity.Warehouse> getMapper() {
        return mapper;
    }

}
