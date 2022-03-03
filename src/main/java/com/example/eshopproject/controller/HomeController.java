package com.example.eshopproject.controller;

import com.example.eshopproject.service.CategoryService;
import com.example.eshopproject.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final CategoryService categoryService;
    private final ProductService productService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model){
        model.addAttribute("categories", categoryService.findAllCategories());
        return "index";
    }

    @GetMapping("/aboutus")
    public String aboutUs(Model model){
        model.addAttribute("categories", categoryService.findAllCategories());
        return "aboutus";
    }

    @GetMapping("/contact")
    public String contact(Model model){
        model.addAttribute("categories", categoryService.findAllCategories());
        return "contact";
    }


}
