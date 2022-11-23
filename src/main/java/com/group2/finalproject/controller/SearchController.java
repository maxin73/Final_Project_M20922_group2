package com.group2.finalproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.group2.finalproject.dao.SearchService;
import com.group2.finalproject.entity.Search;

@Controller
public class SearchController {

  @Autowired
  private SearchService searchService;

  //process for GET
  @GetMapping("/search")
  public String getResult(){
    return "search/new-search";
  }

  //process for POST
  @PostMapping("/search")
  public String postRequest(@RequestParam("text") String str, Model model){

    //register String which comes from display to Model
    model.addAttribute("word", str);

    //move to search.html
    return "search/response";
  }


  //process for POST(DB)
  @PostMapping("/search/db")
  public String postDbRequest(@RequestParam("text2") String str, Model model){

      //search one element
        Search search = searchService.findOne(str);

        //register search result to Model
        model.addAttribute("itemName", search.getItemName());
        model.addAttribute("price", search.getPrice());
        model.addAttribute("itemDescription", search.getItemDescription());

        //move to searchDB.html
        return "/search/responseDB";

  }

  }
