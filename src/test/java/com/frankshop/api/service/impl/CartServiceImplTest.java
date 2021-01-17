package com.frankshop.api.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.frankshop.api.domain.Cart;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CartServiceImplTest extends BaseServiceTest<Cart, com.frankshop.api.entity.Cart> {

    @Autowired
    CartServiceImpl service;

    @Override
    public CartServiceImpl getService() {
        return service;
    }

    @BeforeEach
    public void init() {

    }

    @Test
    public void addToCartSuccessfulTest() {

        String vehicleId = "vehicleId_" + faker.random().nextLong();
        String userId = "userId_" + faker.random().nextLong();

        Cart result = service.addToCart(vehicleId, userId);

        assertFalse(result.getVehicles().isEmpty());
        assertTrue(result.getVehicles().contains(vehicleId));
        assertEquals(userId, result.getUserId());
    }

    @Test
    public void removeFromCartSuccessfulTest() {

        String vehicleId = "vehicleId_" + faker.random().nextLong();
        String userId = "userId_" + faker.random().nextLong();
        String vehicleId2 = "vehicleId_" + faker.random().nextLong();
        service.addToCart(vehicleId, userId);
        service.addToCart(vehicleId2, userId);

        Cart result = service.removeFromCart(vehicleId, userId);

        assertFalse(result.getVehicles().isEmpty());
        assertEquals(1, result.getVehicles().size());
        assertFalse(result.getVehicles().contains(vehicleId));
        assertTrue(result.getVehicles().contains(vehicleId2));
        assertEquals(userId, result.getUserId());
    }

    @Override
    public Cart createObject(String id) {
        Cart v = new Cart();
        v.setId(id);
        return v;
    }

}
