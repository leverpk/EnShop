package com.example.eshopproject.controller;

import com.example.eshopproject.service.CategoryService;
import com.example.eshopproject.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;
    private final CategoryService categoryService;

    @GetMapping("/category/{id}/products")
    public String productsList(Model model, @PathVariable Long id){
        model.addAttribute("categories", categoryService.findAllCategories());
        model.addAttribute("products", productService.findAllProductsInCategory(id));
        model.addAttribute("category", categoryService.getById(id));
        model.addAttribute("categoryId", id);
        return "product/list";
    }

    @GetMapping("/category/{id}/products/{idProduct}")
    public String productDetails(Model model, @PathVariable Long id, @PathVariable Long idProduct){
        model.addAttribute("categories", categoryService.findAllCategories());
        model.addAttribute("products", productService.findAllProductsInCategory(id));
        model.addAttribute("categoryId", id);
        model.addAttribute("product", productService.getByProductId(idProduct));
        model.addAttribute("idProduct", idProduct);
        return "product/details";
    }

    @GetMapping ("/products/searched")
    public String searchedProducts(Model model, @RequestParam(value = "phrase", required = false) String phrase) {
        model.addAttribute("categories", categoryService.findAllCategories());
        model.addAttribute("productsSearched", productService.findAllProductsContainsPhrase(phrase));
        return "product/searched-products";
    }

}
