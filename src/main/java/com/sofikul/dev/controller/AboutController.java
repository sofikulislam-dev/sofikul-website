package com.sofikul.dev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/about")
public class AboutController {

    @GetMapping
    public String about(Model model){
        model.addAttribute("title", "About");
        model.addAttribute("page", "about");
        return "layouts/main";
    }
}
