package com.frankshop.api.controller;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.frankshop.api.mapper.CartDomainMapper;
import com.frankshop.api.service.CartService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(CartController.class)
public class CartControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CartService service;

    @MockBean
    private CartDomainMapper mapper;

    @Test
    public void addToCartInvalidTokenErrorTest() throws Exception {

        this.mockMvc.perform(get("/api/carts/add/vehicle/22").header("Authorization", "token_??")).andDo(print())
                .andExpect(status().is(400)).andExpect(content().string(containsString("valid token required")));
    }

    @Test
    public void addToCartMissingTokenErrorTest() throws Exception {

        this.mockMvc.perform(get("/api/carts/add/vehicle/22")).andDo(print()).andExpect(status().is(400))
                .andExpect(content().string(containsString("Missing request header 'Authorization'")));
    }

    @Test
    public void removeFromCartInvalidTokenErrorTest() throws Exception {

        this.mockMvc.perform(get("/api/carts/remove/vehicle/22").header("Authorization", "token_??")).andDo(print())
                .andExpect(status().is(400)).andExpect(content().string(containsString("valid token required")));
    }

    @Test
    public void removeFromCartMissingTokenErrorTest() throws Exception {

        this.mockMvc.perform(get("/api/carts/remove/vehicle/22")).andDo(print()).andExpect(status().is(400))
                .andExpect(content().string(containsString("Missing request header 'Authorization'")));
    }

    @Test
    public void findUserCartMissingTokenErrorTest() throws Exception {

        this.mockMvc.perform(get("/api/carts/remove/vehicle/22")).andDo(print()).andExpect(status().is(400))
                .andExpect(content().string(containsString("Missing request header 'Authorization'")));
    }

    @Test
    public void findUserCartInvalidTokenErrorTest() throws Exception {

        this.mockMvc.perform(get("/api/carts/remove/vehicle/22").header("Authorization", "token_??")).andDo(print())
                .andExpect(status().is(400)).andExpect(content().string(containsString("valid token required")));
    }

}
