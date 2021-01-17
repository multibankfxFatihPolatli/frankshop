package com.frankshop.api.service.impl;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import com.frankshop.api.domain.BaseDomain;
import com.frankshop.api.entity.BaseEntity;
import com.frankshop.api.service.BaseService;
import com.github.javafaker.Faker;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public abstract class BaseServiceTest<T extends BaseDomain, E extends BaseEntity> {

    public abstract BaseService<T, E> getService();

    public abstract T createObject(String id);

    Faker faker = new Faker();

    @BeforeEach
    public void init() {

    }

    @Test
    public void liistSuccessfulList() {

        String id = "id_" + faker.random().nextLong();
        T data = createObject(id);
        getService().save(data);

        List<T> result = getService().list();

        assertFalse(result.isEmpty());
    }

    @Test
    public void findByIdSuccessfulTest() {
        String id = "id_" + faker.random().nextLong();
        T t = createObject(id);
        getService().save(t);

        Optional<T> result = getService().findById(id);

        assertTrue(result.isPresent());
    }
}