package com.sofikul.dev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/portfolio")
public class PortfolioController {

    @GetMapping
    public String portfolio(Model model) {
        model.addAttribute("title", "Portfolio");
        model.addAttribute("page", "portfolio");
        return "layouts/main";
    }
}
