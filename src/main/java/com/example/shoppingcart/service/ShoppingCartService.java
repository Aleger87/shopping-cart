package com.example.shoppingcart.service;

import com.example.shoppingcart.model.ShoppingCart;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.*;

@Service
public class ShoppingCartService {

    private final ShoppingCart shoppingCart;

    public ShoppingCartService(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }


    public void addProduct(List<Integer> id) {
        this.shoppingCart.addProduct(id);
    }


    public List<Integer> getAllProduct() {
        return this.shoppingCart.getProduct();
    }
}
