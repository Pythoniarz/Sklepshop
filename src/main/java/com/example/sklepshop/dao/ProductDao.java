package com.example.sklepshop.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.example.sklepshop.service.Product;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {

    public List<Product> products = new ArrayList<>(
            Arrays.asList(
            new Product("Owocowa", "Smakowa", new BigDecimal("25.00")),
            new Product("Biała", "Najlepsza", new BigDecimal("99.99")),
            new Product("Czarna", "Jak kawa", new BigDecimal("5.50")),
            new Product("Czerwona", "Żeby schuść", new BigDecimal("6.60")),
            new Product("Arabica", "Jak kawa", new BigDecimal("5.50")),
            new Product("Robusta", "Żeby schuść", new BigDecimal("6.60"))));


    public List<Product> all() {
        return products;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void deleteProduct(Integer index) {
        products.remove(index.intValue());
    }

    public Product byName(String name) {
        for (Product product : products) {
            if (name.equals(product.getName())) {
                return product;
            }
        }
        return null;
    }
}