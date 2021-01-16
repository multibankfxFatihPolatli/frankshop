package com.frankshop.api.mapper;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface WarehouseEntityMapper
        extends BaseEntityMapper<com.frankshop.api.domain.Warehouse, com.frankshop.api.entity.Warehouse> {

}
