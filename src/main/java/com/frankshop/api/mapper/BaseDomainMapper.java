package com.frankshop.api.mapper;

import java.util.List;

import com.frankshop.api.domain.BaseDomain;
import com.frankshop.api.dto.BaseDto;

public interface BaseDomainMapper<S extends BaseDto, T extends BaseDomain> {

    public S toDto(T t);

    public List<S> toDtoList(List<T> t);

    public T toDomain(S s);

    public List<T> toDomainList(List<S> s);

}
