package com.frankshop.api.mapper;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CartDomainMapper
                extends BaseDomainMapper<com.frankshop.api.dto.Cart, com.frankshop.api.domain.Cart> {

}
