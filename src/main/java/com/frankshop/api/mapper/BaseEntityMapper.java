package com.frankshop.api.mapper;

import java.util.List;

import com.frankshop.api.domain.BaseDomain;
import com.frankshop.api.entity.BaseEntity;

public interface BaseEntityMapper<S extends BaseDomain, T extends BaseEntity> {

    public T toEntity(S s);

    public List<T> toEntityList(List<S> s);

    public S toDomain(T t);

    public List<S> toDomainList(List<T> t);

}
