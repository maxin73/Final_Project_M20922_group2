package com.group2.finalproject.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.group2.finalproject.dao.iBuyRepository;
import com.group2.finalproject.entity.Buy;



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
    @GetMapping("/delete/")
    public String deleteCart(@RequestParam(name="id") Long Id){
        buyRepository.deleteById(Id);
        return "redirect:/cart/new";


    }
}


