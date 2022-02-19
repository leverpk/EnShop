package com.example.eshopproject.controller;

import com.example.eshopproject.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/category")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

//    @GetMapping("/{id}")
//    public String getCategories(Model model) {
//        model.addAttribute("categories", categoryService.findAllCategories());
//        return "/category";
//    }
}
