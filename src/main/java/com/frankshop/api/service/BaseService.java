package com.frankshop.api.service;

import java.util.List;
import java.util.Optional;

import com.frankshop.api.domain.BaseDomain;
import com.frankshop.api.entity.BaseEntity;

import org.springframework.data.domain.Pageable;

public abstract interface BaseService<D extends BaseDomain, E extends BaseEntity> {

    public List<D> list();

    public List<D> list(Pageable pageable);

    public List<D> listAllByIds(List<String> ids);

    public Optional<D> findById(String id);

    public D save(D data);

}
