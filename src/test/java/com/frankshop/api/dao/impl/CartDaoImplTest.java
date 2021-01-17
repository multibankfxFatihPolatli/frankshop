package com.frankshop.api.dao.impl;

import com.frankshop.api.entity.Cart;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CartDaoImplTest extends BaseDaoTest<Cart> {

    @Autowired
    CartDaoImpl dao;

    @Override
    public CartDaoImpl getDao() {
        return dao;
    }

    @BeforeEach
    public void init() {

    }

    @Override
    public Cart createObject(String id) {
        Cart v = new Cart();
        v.setId(id);
        return v;
    }

}
