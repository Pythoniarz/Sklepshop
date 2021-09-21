package com.example.sklepshop.web;

import com.example.sklepshop.dao.CategoryDao;
import com.example.sklepshop.dao.ProductDao;
import com.example.sklepshop.service.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;


@Controller
@RequestMapping("admin")
public class AdminController {

    @Autowired
    private ProductDao productDao;
    @Autowired
    private CategoryDao categoryDao;

    @GetMapping("/")
    public String admin() {
        return "admin/admin";
    }


    @GetMapping("/add-product-form")
    public String addProductForm(Model model) {
        model.addAttribute("newProduct", new Product());
        return "admin/add-product-form";
    }

    @PostMapping("/add-product")
    public String addProduct(@ModelAttribute Product product) {
        productDao.addProduct(product);
        System.out.println(product.toString());
        return "redirect:/sklep";
    }

    @GetMapping("/edit-product-list")
    public String editProductList(Model model) {
        model.addAttribute("categories", categoryDao.all());
        model.addAttribute("products", productDao.all());
        return "admin/edit-product-list";
    }

    @PostMapping("/edit-product")
    public String editProduct(@RequestParam("index") Integer index,
                              @RequestParam("name") String productName,
                              @RequestParam("desc") String productDescription,
                              @RequestParam("price") BigDecimal productPrice,
                              @RequestParam("product_category") int categoryId) {
        productDao.editProduct(index, productName, productDescription, productPrice, categoryId);
        return "redirect:/sklep";
    }


    @GetMapping("/remove-product-list")
    public String removeProductList(Model model) {
        model.addAttribute("products", productDao.all());
        return "admin/remove-product-list";
    }

    @PostMapping("/remove-product")
    public String removeProduct(@RequestParam("index") Integer index) {
        productDao.deleteProduct(index);
        return "redirect:/sklep";
    }

}

