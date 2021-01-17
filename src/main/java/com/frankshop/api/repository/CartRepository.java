package com.frankshop.api.repository;

import java.util.Optional;

import com.frankshop.api.entity.Cart;

public interface CartRepository extends BaseRepository<Cart> {

    public Optional<Cart> findByUserId(String userId);
}
