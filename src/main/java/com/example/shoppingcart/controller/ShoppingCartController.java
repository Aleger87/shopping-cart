package com.example.shoppingcart.controller;

import com.example.shoppingcart.model.ShoppingCart;
import com.example.shoppingcart.service.ShoppingCartService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/order")
public class ShoppingCartController {
 private final ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @GetMapping("/add")
    public void addProduct (@RequestParam("id")List<Integer> id) {
         this.shoppingCartService.addProduct(id);
    }

    @GetMapping("/get")
    public List<Integer> getAllShoppingCart() {
        return this.shoppingCartService.getAllProduct();
    }


}
