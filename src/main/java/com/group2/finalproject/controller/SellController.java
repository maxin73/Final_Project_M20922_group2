package com.group2.finalproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.group2.finalproject.dao.iSellRepository;
import com.group2.finalproject.entity.item_table;

@Controller
@RequestMapping("/sell")

public class SellController {
  @Autowired
  iSellRepository sellRepository;

  @GetMapping("/new")
  public String displaySellForm(Model model){
    model.addAttribute("sell", new item_table());
    return "sell/new-sell";
  }

  @PostMapping("/save")
  public String registerItem(item_table sell, Model mode){
    sellRepository.save(sell);
    return "redirect:/sell/new";
  }

}
