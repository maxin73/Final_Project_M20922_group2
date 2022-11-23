package com.group2.finalproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.group2.finalproject.dao.iCartRepository;
import com.group2.finalproject.entity.Cart;

@Controller
@RequestMapping("/shoppingCart")
public class CartController {
    @Autowired
    iCartRepository cartRepository;
    
    @GetMapping("/new")
    public String displayCart(Model model){
        model.addAttribute("cart", new Cart());
        return "cart/new-cart";
    }

    @PostMapping("/save")
    public String createCart(Cart cart, Model model){
        cartRepository.save(cart);  
        return "redirect:/shoppingCart/new";   
    }
}
