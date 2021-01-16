package com.frankshop.api.dao.impl;

import java.util.List;
import java.util.Optional;

import com.frankshop.api.entity.BaseEntity;
import com.frankshop.api.repository.BaseRepository;

import org.springframework.data.domain.Pageable;

public abstract class BaseDaoImpl<E extends BaseEntity> {

    public abstract BaseRepository<E> getRepository();

    public List<E> list() {
        return getRepository().findAll();
    }

    public List<E> list(Pageable pageable) {
        return getRepository().findAll(pageable).getContent();
    }

    public Optional<E> findById(String id) {
        return getRepository().findById(id);
    }

    
}
