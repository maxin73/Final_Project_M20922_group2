package com.finalproject.m20922.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController { 

    @GetMapping("/")
    public String GetHome(){
        return "home/index"; 
    }
   
}

