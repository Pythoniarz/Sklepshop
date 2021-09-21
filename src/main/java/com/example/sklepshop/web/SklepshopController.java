package com.example.sklepshop.web;

import com.example.sklepshop.dao.CategoryDao;
import com.example.sklepshop.dao.ProductDao;
import com.example.sklepshop.service.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

@Controller
public class SklepshopController {

    @Autowired
    private ProductDao productDao;
    @Autowired
    private CategoryDao categoryDao;

    @GetMapping
    public String hello() {
        return "home";
    }

    @GetMapping("/sklep")
    public String products(Model model) {
        model.addAttribute("categories", categoryDao.all());
        model.addAttribute("products", productDao.all());
        return "sklep";
    }

    @PostMapping("/sklep")
    public String selectCategory(@RequestParam("category") Integer categoryId) {

        return "sklep";
    }





}
