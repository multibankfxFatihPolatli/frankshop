package com.frankshop.api.controller;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import com.frankshop.api.base.GenericResponse;
import com.frankshop.api.domain.BaseDomain;
import com.frankshop.api.dto.BaseDto;
import com.frankshop.api.mapper.BaseDomainMapper;
import com.frankshop.api.service.BaseService;

import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public abstract class BaseController<T extends BaseDto, K extends BaseDomain> {

    public abstract BaseService getService();

    public abstract BaseDomainMapper<T, K> getMapper();

    @GetMapping()
    public ResponseEntity list(Pageable pageable) {

        List<T> result = getMapper().toDtoList(getService().list(pageable));

        return GenericResponse.createGenericSuccessResponse(result);
    }

    @GetMapping("{id}")
    public ResponseEntity findById(@RequestParam(name = "id") String id) {

        Optional<K> item = getService().findById(id);

        if (item.isPresent()) {
            T result = getMapper().toDto(item.get());

            return GenericResponse.createGenericSuccessResponse(result);
        }
        throw new NoSuchElementException();
    }

}
