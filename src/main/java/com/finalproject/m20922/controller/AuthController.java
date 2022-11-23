package com.finalproject.m20922.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.finalproject.m20922.dao.iAuthRepository;
import com.finalproject.m20922.entity.User;

@Controller
public class AuthController {

    @Autowired
    iAuthRepository authRepository;

    @GetMapping("/login")
    public String showLogin(Model model){
        model.addAttribute("user", new User());
        return "auth/login";
    }

    @GetMapping("/register")
    public String showRegister(Model model){
        model.addAttribute("user", new User());
        return "auth/register";
    }

    @PostMapping("/login")
    public String handleLogin(User user, Model model){

        if(authRepository.findByEmailAndPassword(user.getEmail(), user.getPassword()) != null){
            return "redirect:/";
        }else{
            return "redirect:/login";
        }
    }

    @PostMapping("/register")
    public String handleRegister(User user, Model model){

        if(user.getFullName() != null && user.getEmail() != null && user.getPassword() != null){
            authRepository.save(user);
            return "redirect:/register";
        }else{
            return "redirect:/register";
        }
        
    }
}
