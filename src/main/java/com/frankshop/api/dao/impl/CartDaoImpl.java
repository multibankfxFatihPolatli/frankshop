package com.frankshop.api.dao.impl;

import java.util.Optional;

import com.frankshop.api.dao.CartDao;
import com.frankshop.api.entity.Cart;
import com.frankshop.api.repository.BaseRepository;
import com.frankshop.api.repository.CartRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CartDaoImpl extends BaseDaoImpl<Cart> implements CartDao {

    @Autowired
    private CartRepository repository;

    @Override
    public BaseRepository<Cart> getRepository() {

        return repository;
    }

    @Override
    public Optional<Cart> findByUserId(String userId){

        return repository.findByUserId(userId);
    }
}
