package com.gitlab.dmitriy_shkarpetin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping ("/")
    public String getIndex(){
        return "redirect:/index.html";
    }

}
