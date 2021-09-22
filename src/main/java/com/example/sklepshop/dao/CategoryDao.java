package com.example.sklepshop.dao;

import com.example.sklepshop.service.Category;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class CategoryDao {

    private List<Category> categories = new ArrayList<>(Arrays.asList(
            new Category("Herbata", 1L),
            new Category("Kawa", 2L)));

    public List<Category> all() {
        return categories;
    }



}
