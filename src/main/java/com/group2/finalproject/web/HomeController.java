package com.group2.finalproject.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.group2.finalproject.domain.User;

@Controller
public class HomeController {
    
    @RequestMapping("/")
    public String home(Model model){   
        model.addAttribute("formData", new User());
        return "index";
    }
}