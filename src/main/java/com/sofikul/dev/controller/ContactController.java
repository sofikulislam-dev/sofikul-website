package com.sofikul.dev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(("/contact"))
public class ContactController {

    @GetMapping
    public String contact(Model model) {
        model.addAttribute("title", "Contact");
        model.addAttribute("page", "contact");
        return "layouts/main";
    }
}
