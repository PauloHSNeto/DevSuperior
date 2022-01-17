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
		
		Product p1 = new Product(1L, "Lord of the Rings", 30.00,true, cat2 );
		Product p2 = new Product(2L, "Monitor", 300.00,true, cat1);
		Product p3 = new Product(3L, "Iphone 8", 800.00,true, cat4);
		Product p4 = new Product(4L, "God of War", 60.00,true, cat3);
		Product p5 = new Product(5L, "A Game of Thrones", 30.00,true, cat2);
		Product p6 = new Product(6L, "Nintendo Switch", 500.00,false, cat1);
		Product p7 = new Product(7L, "PS5", 700.00,true, cat1);
		Product p8 = new Product(8L, "The Name of the Wind", 25.00,false, cat2);
		Product p9 = new Product(9L, "Samsung Galaxy", 700.00,true, cat4);
		Product p10 = new Product(10L, "The Legend of Zelda", 55.00,true, cat3);
		Product p11 = new Product(11L, "Xbox Series X", 650.00,true, cat1);
		Product p12 = new Product(12L, "Halo", 650.00,true, cat3);
		Product p13 = new Product(13L, "The Way of Kings", 29.00,false, cat2);
		Product p14 = new Product(14L, "The Strain", 22.00,false, cat2);
		Product p15 = new Product(15L, "World of Warcraft", 45.00,true, cat3);
		Product p16 = new Product(16L, "Tablet", 400.00,true, cat1);
		
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