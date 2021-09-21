package com.example.sklepshop.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.example.sklepshop.service.Product;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {

    private List<Product> products = new ArrayList<>(
            Arrays.asList(
            new Product("Owocowa", "Smakowa", new BigDecimal("25.00"), 1),
            new Product("Biała", "Najlepsza", new BigDecimal("99.99"), 1),
            new Product("Czarna", "Jak kawa", new BigDecimal("5.50"), 1),
            new Product("Czerwona", "Żeby schuść", new BigDecimal("6.60"), 1),
            new Product("Arabica", "Jak kawa", new BigDecimal("5.50"), 2),
            new Product("Robusta", "Żeby schuść", new BigDecimal("6.60"), 2)));


    public List<Product> all() {
        return products;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void editProduct(int index, String productName, String productDescription, BigDecimal productPrice, int categoryId) {
        Product product = new Product(productName, productDescription, productPrice, categoryId);
        products.set(index, product);
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
