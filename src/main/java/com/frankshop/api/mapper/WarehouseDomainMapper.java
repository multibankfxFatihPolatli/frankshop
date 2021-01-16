package com.frankshop.api.mapper;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface WarehouseDomainMapper
                extends BaseDomainMapper<com.frankshop.api.dto.Warehouse, com.frankshop.api.domain.Warehouse> {

}
