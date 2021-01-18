package com.frankshop.api.service.impl;

import java.util.Optional;

import com.frankshop.api.dao.BaseDao;
import com.frankshop.api.dao.CartDao;
import com.frankshop.api.domain.Cart;
import com.frankshop.api.mapper.BaseEntityMapper;
import com.frankshop.api.mapper.CartEntityMapper;
import com.frankshop.api.service.CartService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CartServiceImpl extends BaseServiceImpl<Cart, com.frankshop.api.entity.Cart> implements CartService {

    @Autowired
    private CartDao dao;

    @Autowired
    private CartEntityMapper mapper;

    @Override
    public BaseDao<com.frankshop.api.entity.Cart> getDao() {
        return dao;
    }

    @Override
    public BaseEntityMapper<Cart, com.frankshop.api.entity.Cart> getMapper() {
        return mapper;
    }

    @Override
    public Cart addToCart(String vehicleId, String userId) {

        Optional<com.frankshop.api.entity.Cart> userCart = dao.findByUserId(userId);

        com.frankshop.api.entity.Cart resultCart = null;
        if (userCart.isEmpty()) {

            com.frankshop.api.entity.Cart newCart = new com.frankshop.api.entity.Cart();
            newCart.setUserId(userId);

            resultCart = dao.save(newCart);
        } else {
            resultCart = userCart.get();
        }

        resultCart.getVehicles().add(vehicleId);

        return getMapper().toDomain(dao.save(resultCart));
    }

    @Override
    public Cart removeFromCart(String vehicleId, String userId) {

        Optional<com.frankshop.api.entity.Cart> userCart = dao.findByUserId(userId);

        com.frankshop.api.entity.Cart resultCart = null;
        if (userCart.isEmpty()) {

            com.frankshop.api.entity.Cart newCart = new com.frankshop.api.entity.Cart();
            newCart.setUserId(userId);

            resultCart = dao.save(newCart);

            return getMapper().toDomain(resultCart);
        } else {
            resultCart = userCart.get();
        }

        resultCart.getVehicles().remove(vehicleId);

        return getMapper().toDomain(dao.save(resultCart));
    }

    @Override
    public Optional<Cart> findByUserId(String userId) {

        return Optional.ofNullable(getMapper().toDomain(dao.findByUserId(userId).get()));
    }

}
