package com.frankshop.api.controller;

import com.frankshop.api.base.GenericResponse;
import com.frankshop.api.dto.Cart;
import com.frankshop.api.exceptions.ValidTokenRequiredException;
import com.frankshop.api.mapper.BaseDomainMapper;
import com.frankshop.api.mapper.CartDomainMapper;
import com.frankshop.api.service.BaseService;
import com.frankshop.api.service.CartService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/carts")
public class CartController extends BaseController<com.frankshop.api.dto.Cart, com.frankshop.api.domain.Cart> {

    @Autowired
    private CartService service;

    @Autowired
    private CartDomainMapper mapper;

    @Override
    public BaseService getService() {
        return service;
    }

    @Override
    public BaseDomainMapper<Cart, com.frankshop.api.domain.Cart> getMapper() {
        return mapper;
    }

    @GetMapping("add/vehicle/{vehicleId}")
    public ResponseEntity addToCart(@PathVariable(name = "vehicleId") String vehicleId)
            throws ValidTokenRequiredException {

        String userId = context.getUserId();

        checkUserId(userId);

        Cart result = getMapper().toDto(service.addToCart(vehicleId, userId));

        return GenericResponse.createGenericSuccessResponse(result);
    }

    @GetMapping("remove/vehicle/{vehicleId}")
    public ResponseEntity removeFromCart(@PathVariable(name = "vehicleId") String vehicleId)
            throws ValidTokenRequiredException {

        String userId = context.getUserId();

        checkUserId(userId);

        Cart result = getMapper().toDto(service.removeFromCart(vehicleId, userId));

        return GenericResponse.createGenericSuccessResponse(result);
    }
}
