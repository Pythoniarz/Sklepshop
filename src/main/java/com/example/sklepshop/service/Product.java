package com.example.sklepshop.service;


import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Product {
    public String name;
    public String description;
    public BigDecimal price;
    public Integer categoryId;

    public Product(String name, String description, BigDecimal price, Integer categoryId) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.categoryId = categoryId;
    }

    public Product() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return  "Name :" + this.name +
                " Description: " + description +
                " Price: " + this.price;
    }

}
