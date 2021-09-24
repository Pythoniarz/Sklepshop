package com.example.sklepshop;

import com.example.sklepshop.dao.ProductRepository;
import com.example.sklepshop.service.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;


@SpringBootApplication
public class SklepshopApplication implements CommandLineRunner {

	@Autowired
	private ProductRepository productRepo;

	public static void main(String[] args) {
		SpringApplication.run(SklepshopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

////		productRepo.save(new Product("Owocowa", "Smakowa", new BigDecimal("25.00"), 1));
//		productRepo.save(new Product("Biała", "Najlepsza", new BigDecimal("99.99"), 1));
//		productRepo.save(new Product("Czarna", "Jak kawa", new BigDecimal("5.50"), 1));
//		productRepo.save(new Product("Czerwona", "Żeby schuść", new BigDecimal("6.60"), 1));
//		productRepo.save(new Product("Arabica", "Jak kawa", new BigDecimal("5.50"), 2));
//		productRepo.save(new Product("Robusta", "Żeby schuść", new BigDecimal("6.60"), 2));

		}
	}


