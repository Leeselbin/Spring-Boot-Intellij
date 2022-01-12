package com.example.projtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hi")
    public String meet(Model model){
        model.addAttribute("username", "hongpark");
        return "greetings";
    }

}
