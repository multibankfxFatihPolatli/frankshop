package com.frankshop.api.controller;

import com.frankshop.api.mapper.BaseDomainMapper;
import com.frankshop.api.mapper.VehicleDomainMapper;
import com.frankshop.api.service.BaseService;
import com.frankshop.api.service.VehicleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/vehicles")
public class VehicleController extends BaseController<com.frankshop.api.dto.Vehicle, com.frankshop.api.domain.Vehicle> {

    @Autowired
    private VehicleService service;

    @Autowired
    private VehicleDomainMapper mapper;

    @Override
    public BaseService getService() {
        return service;
    }

    @Override
    public BaseDomainMapper<com.frankshop.api.dto.Vehicle, com.frankshop.api.domain.Vehicle> getMapper() {
        return mapper;
    }

}
