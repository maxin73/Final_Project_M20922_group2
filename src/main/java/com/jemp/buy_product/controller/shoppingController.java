package com.jemp.buy_product.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;

@RestController
@RequestMapping("/product")
public class shoppingController {

    @GetMapping("/details")
    public ResponseEntity<List<productDetails> getProduct(){
        List<productDetails> product = product.getAllProducts();
        return new ResponseEntity<>(product, null);
    }

    
}
