package com.frankshop.api.dao.impl;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import com.frankshop.api.dao.BaseDao;
import com.frankshop.api.entity.BaseEntity;
import com.github.javafaker.Faker;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public abstract class BaseDaoTest<T extends BaseEntity> {

    public abstract BaseDao<T> getDao();

    public abstract T createObject(String id);

    Faker faker = new Faker();

    @BeforeEach
    public void init() {

    }

    @Test
    public void liistSuccessfulList() {
        String id = "id_" + faker.random().nextLong();
        T data = createObject(id);
        getDao().save(data);

        List<T> result = getDao().list();

        assertFalse(result.isEmpty());
    }

    @Test
    public void findByIdSuccessfulTest() {
        String id = "id_" + faker.random().nextLong();
        T t = createObject(id);
        getDao().save(t);

        Optional<T> result = getDao().findById(id);

        assertTrue(result.isPresent());
    }
}
