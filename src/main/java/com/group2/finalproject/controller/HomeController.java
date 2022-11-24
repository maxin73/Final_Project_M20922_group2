package com.group2.finalproject.controller;

import java.util.List;

import org.hibernate.annotations.SourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.group2.finalproject.dao.SearchService;
import com.group2.finalproject.dao.iSellRepository;
import com.group2.finalproject.entity.Search;
import com.group2.finalproject.entity.Sell;

@Controller
public class HomeController {
  

  @Autowired
  iSellRepository sellRepository;

  @Autowired
  private SearchService searchService;


  @GetMapping("/")
  public String displayHome(Model model){
    List<Sell> items = sellRepository.findAll();
    model.addAttribute("items", items);
    return "top/index";
    }

  //process for POST(DB)
  @PostMapping("/search/db")
  public String postDbRequest(@RequestParam("text2") String str, Model model){
  
      //search one element
        Search search = searchService.find(str);

        //register search result to Model
        model.addAttribute("price", search.getPrice());
        model.addAttribute("itemDescription", search.getItemDescription());

        if(search.getItemName() != null){
          model.addAttribute("itemName", search.getItemName());
        } else if (search.getItemName() == null){
          return "Product not found";
        }

        
        
        //move to searchDB.html
        return "/search/responseDB";

      
  
    }

  }

