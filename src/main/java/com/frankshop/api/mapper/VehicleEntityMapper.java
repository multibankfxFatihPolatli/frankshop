package com.frankshop.api.mapper;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VehicleEntityMapper
                extends BaseEntityMapper<com.frankshop.api.domain.Vehicle, com.frankshop.api.entity.Vehicle> {

}
