package com.example.eshopproject.controller;

import com.example.eshopproject.service.CategoryService;
import com.example.eshopproject.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;
    private final CategoryService categoryService;

    @GetMapping("/category/{id}/product")
    public String productsList(Model model, @PathVariable Long id){
        model.addAttribute("categories", categoryService.findAllCategories());
        model.addAttribute("products", productService.findAllProductsInCategory(id));
        model.addAttribute("category", categoryService.getById(id));
        model.addAttribute("categoryId", id);
        return "product/list";
    }

}
