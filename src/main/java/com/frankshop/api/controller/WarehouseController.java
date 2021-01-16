package com.frankshop.api.controller;

import com.frankshop.api.dto.Warehouse;
import com.frankshop.api.mapper.BaseDomainMapper;
import com.frankshop.api.mapper.WarehouseDomainMapper;
import com.frankshop.api.service.BaseService;
import com.frankshop.api.service.WarehouseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/warehouses")
public class WarehouseController
        extends BaseController<com.frankshop.api.dto.Warehouse, com.frankshop.api.domain.Warehouse> {

    @Autowired
    private WarehouseService service;

    @Autowired
    private WarehouseDomainMapper mapper;

    @Override
    public BaseService getService() {
        return service;
    }

    @Override
    public BaseDomainMapper<Warehouse, com.frankshop.api.domain.Warehouse> getMapper() {
        return mapper;
    }

}
