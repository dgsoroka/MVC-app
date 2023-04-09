package com.web.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class FirstController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "Работает");
        return "index";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "Работает");
        return "about";
    }
}
