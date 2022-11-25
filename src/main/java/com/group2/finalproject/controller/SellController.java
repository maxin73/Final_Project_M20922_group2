package com.group2.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.group2.finalproject.dao.iSellRepository;
import com.group2.finalproject.entity.Sell;

@Controller
@RequestMapping("/sell")

public class SellController {
  @Autowired
  iSellRepository sellRepository;

  @GetMapping("/new")
  public String displaySellForm(Model model){
    model.addAttribute("sell", new Sell());
    return "sell/new-sell";
  }

  @GetMapping("/")
  public String displayHome(Model model){
    List<Sell> items = sellRepository.findAll();
    model.addAttribute("items", items);
    return "top/index";
  }

  @PostMapping("/save")
  public String registerItem(Sell sell, Model mode){
    sellRepository.save(sell);
    return "redirect:/";
  }



}
