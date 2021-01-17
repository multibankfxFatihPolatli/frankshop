package com.frankshop.api.service.impl;

import java.util.List;
import java.util.Optional;

import com.frankshop.api.dao.BaseDao;
import com.frankshop.api.domain.BaseDomain;
import com.frankshop.api.entity.BaseEntity;
import com.frankshop.api.mapper.BaseEntityMapper;

import org.springframework.data.domain.Pageable;

public abstract class BaseServiceImpl<D extends BaseDomain, E extends BaseEntity> {

    public abstract BaseDao<E> getDao();

    public abstract BaseEntityMapper<D, E> getMapper();

    public List<D> list() {
        return getMapper().toDomainList(getDao().list());
    }

    public List<D> list(Pageable pageable) {

        return getMapper().toDomainList(getDao().list(pageable));
    }

    public List<D> listAllByIds(List<String> ids) {

        return getMapper().toDomainList(getDao().listAllById(ids));
    }

    public Optional<D> findById(String id) {
        return Optional.ofNullable(getMapper().toDomain(getDao().findById(id).get()));
    }
}
