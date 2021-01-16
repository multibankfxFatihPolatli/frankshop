package com.frankshop.api.mapper;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VehicleDomainMapper
        extends BaseDomainMapper<com.frankshop.api.dto.Vehicle, com.frankshop.api.domain.Vehicle> {

}
