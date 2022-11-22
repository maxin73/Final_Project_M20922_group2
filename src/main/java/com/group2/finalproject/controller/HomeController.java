package com.group2.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.group2.finalproject.dao.iSellRepository;
import com.group2.finalproject.entity.Sell;

@Controller
public class HomeController {
  
  @Autowired
  iSellRepository sellRepository;

  @GetMapping("/")
  public String displayHome(Model model){
    List<Sell> items = sellRepository.findAll();
    model.addAttribute("items", items);
    return "top/index";

  }

}
