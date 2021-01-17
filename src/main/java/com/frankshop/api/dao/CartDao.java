package com.frankshop.api.dao;

import java.util.Optional;

import com.frankshop.api.entity.Cart;

public interface CartDao extends BaseDao<Cart> {

   public Optional<Cart> findByUserId(String userId);
}
