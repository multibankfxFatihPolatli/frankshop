package com.frankshop.api.mapper;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CartEntityMapper
                extends BaseEntityMapper<com.frankshop.api.domain.Cart, com.frankshop.api.entity.Cart> {

}
