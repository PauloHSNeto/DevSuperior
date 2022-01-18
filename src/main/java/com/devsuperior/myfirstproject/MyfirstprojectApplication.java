package com.devsuperior.myfirstproject;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.myfirstproject.entities.Category;
import com.devsuperior.myfirstproject.entities.Product;
import com.devsuperior.myfirstproject.repositories.CategoryRepository;
import com.devsuperior.myfirstproject.repositories.ProductRepository;

@SpringBootApplication
public class MyfirstprojectApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private ProductRepository productRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MyfirstprojectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		
		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Video-Games");
		Category cat4 = new Category(null, "SmarthPhones");		
		
		Product p1 = new Product(null, "Lord of the Rings", 30.00,true, cat2 );
		Product p2 = new Product(null, "Monitor", 300.00,true, cat1);
		Product p3 = new Product(null, "Iphone 8", 800.00,true, cat4);
		Product p4 = new Product(null, "God of War", 60.00,true, cat3);
		Product p5 = new Product(null, "A Game of Thrones", 30.00,true, cat2);
		Product p6 = new Product(null, "Nintendo Switch", 500.00,false, cat1);
		Product p7 = new Product(null, "PS5", 700.00,true, cat1);
		Product p8 = new Product(null, "The Name of the Wind", 25.00,false, cat2);
		Product p9 = new Product(null, "Samsung Galaxy", 700.00,true, cat4);
		Product p10 = new Product(null, "The Legend of Zelda", 55.00,true, cat3);
		Product p11 = new Product(null, "Xbox Series X", 650.00,true, cat1);
		Product p12 = new Product(null, "Halo", 650.00,true, cat3);
		Product p13 = new Product(null, "The Way of Kings", 29.00,false, cat2);
		Product p14 = new Product(null, "The Strain", 22.00,false, cat2);
		Product p15 = new Product(null, "World of Warcraft", 45.00,true, cat3);
		Product p16 = new Product(null, "Tablet", 400.00,true, cat1);
		
		categoryRepository.save(cat1);
		categoryRepository.save(cat2);
		categoryRepository.save(cat3);
		categoryRepository.save(cat4);

		cat1.getProducts().addAll(Arrays.asList(p2, p6,p7,p11,p16));
		cat2.getProducts().addAll(Arrays.asList(p1,p5,p8,p13,p14));
		cat3.getProducts().addAll(Arrays.asList(p4,p10,p12,p15));
		cat4.getProducts().addAll(Arrays.asList(p3,p9));
		
		productRepository.save(p1);
		productRepository.save(p2);
		productRepository.save(p3);
		productRepository.save(p4);
		productRepository.save(p5);
		productRepository.save(p6);
		productRepository.save(p7);
		productRepository.save(p8);
		productRepository.save(p9);
		productRepository.save(p10);
		productRepository.save(p11);
		productRepository.save(p12);
		productRepository.save(p13);
		productRepository.save(p14);
		productRepository.save(p15);
		productRepository.save(p16);		
		}
}