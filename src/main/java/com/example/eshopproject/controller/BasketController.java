package com.example.eshopproject.controller;

import com.example.eshopproject.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class BasketController {

    private final CategoryService categoryService;

    @GetMapping("/basket/list")
    public String basketList(Model model){
        model.addAttribute("categories", categoryService.findAllCategories());
        return "basket/list";
    }

}
