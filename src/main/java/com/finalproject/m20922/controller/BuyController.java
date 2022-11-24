package com.finalproject.m20922.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.finalproject.m20922.dao.iBuyRepository;
import com.finalproject.m20922.entity.Buy;

@Controller
@RequestMapping("/buy")
public class BuyController {

    @Autowired
    iBuyRepository buyRepository;
    
    @GetMapping("/new")
    public String displayBuyForm(Model model){
        model.addAttribute("buy", new Buy());
        return "buy/new-buy";
    }

    @PostMapping("/save")
    public String createProject(Buy buy, Model model){
        buyRepository.save(buy);
        return "redirect:/buy/new";
    }
}
