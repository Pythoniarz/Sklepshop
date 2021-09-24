package com.example.sklepshop;

import com.example.sklepshop.dao.CategoryDao;
import com.example.sklepshop.dao.ProductDao;
import com.example.sklepshop.service.Product;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SklepshopApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void deletingItemFromList() {
		List<Product> list= new ProductDao().all();

	}

}
