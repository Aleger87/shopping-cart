package com.example.shoppingcart.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class ShoppingCart {
    private final List<Integer> id = new ArrayList<>();

    public void addProduct(List<Integer> id){
        this.id.addAll(id);
    }

    public List<Integer> getProduct() {
        return this.id;
    }
}
