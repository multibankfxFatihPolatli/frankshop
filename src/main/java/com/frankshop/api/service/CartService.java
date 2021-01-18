package com.frankshop.api.service;

import java.util.Optional;

import com.frankshop.api.dao.BaseDao;
import com.frankshop.api.domain.Cart;
import com.frankshop.api.mapper.BaseEntityMapper;

public interface CartService extends BaseService<Cart, com.frankshop.api.entity.Cart> {

    public BaseDao<com.frankshop.api.entity.Cart> getDao();

    public BaseEntityMapper<Cart, com.frankshop.api.entity.Cart> getMapper();

    public Cart addToCart(String vehicleId, String userId);

    public Cart removeFromCart(String vehicleId, String userId);

    public Optional<Cart> findByUserId(String userId);

}
