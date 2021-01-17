package com.frankshop.api.dao;

import java.util.List;
import java.util.Optional;

import com.frankshop.api.entity.BaseEntity;

import org.springframework.data.domain.Pageable;

public abstract interface BaseDao<E extends BaseEntity> {

    public List<E> list();

    public List<E> list(Pageable pageable);

    public List<E> listAllById(List<String> ids);

    public Optional<E> findById(String id);

    public E save(E data);

}
