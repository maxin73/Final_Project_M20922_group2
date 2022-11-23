
package com.finalproject.m20922.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.finalproject.m20922.dao.iBuyRepository;
import com.finalproject.m20922.entity.Buy;


@Controller
@RequestMapping("/cart")
public class CartController {

    @Autowired 
    iBuyRepository buyRepository;

    @GetMapping("/new")
    public String displayCartForm(Model model){ 
        List<Buy> buys = buyRepository.findAll(); 
        model.addAttribute("buys", buys); 
        return "cart/new-cart"; 
    }
}

