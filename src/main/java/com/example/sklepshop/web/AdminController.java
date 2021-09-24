package com.example.sklepshop.web;

import com.example.sklepshop.dao.CategoryDao;
import com.example.sklepshop.dao.ProductDao;
import com.example.sklepshop.dao.ProductRepository;
import com.example.sklepshop.service.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("admin")
public class AdminController {

    private final ProductRepository productRepository;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private CategoryDao categoryDao;

    public AdminController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/")
    public String admin() {
        return "admin/admin";
    }

    @GetMapping("/products")
    public String getAllProducts(Model model) {
        model.addAttribute("products", productRepository.findAll());
        return "admin/list";
    }

    @GetMapping("/add-product-form")
    public String addProductForm(Model model) {
        model.addAttribute("newProduct", new Product());
        return "admin/add-product-form";
    }

    @PostMapping("/add-product")
    public String addProduct(@ModelAttribute Product product) {
        productRepository.save(product);
        return "redirect:/admin/products";
    }

    @GetMapping("/edit-product/{id}")
    public String showEditProductForm(Model model, @PathVariable long id) {
        model.addAttribute("product", productRepository.getById(id));
        return "admin/edit";
    }

    @PostMapping("/edit-product/{id}")
    public String editProduct(@ModelAttribute Product product, @PathVariable long id) {

        var productFromDB = productRepository.getById(id);

        productFromDB.setName(product.getName());
        productFromDB.setCategoryId(product.getCategoryId());
        productFromDB.setDescription(product.getDescription());
        productFromDB.setPrice(product.getPrice());

        productRepository.save(productFromDB);
        return "redirect:/admin/products";
    }


//    @GetMapping("/remove-product-list")
//    public String removeProductList(Model model) {
//        model.addAttribute("products", productRepository.findAll());
//        return "admin/remove-product-list";
//    }

    @PostMapping("/remove-product")
    public String removeProduct(@RequestParam("id") Long id) {
//        productDao.deleteProduct(id);
        productRepository.deleteById(id);
        return "redirect:/admin/products";
    }

}

