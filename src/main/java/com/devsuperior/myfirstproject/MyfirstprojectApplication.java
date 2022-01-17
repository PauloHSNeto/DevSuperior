package com.devsuperior.myfirstproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.myfirstproject.entities.Category;
import com.devsuperior.myfirstproject.repositories.CategoryRepository;

@SpringBootApplication
public class MyfirstprojectApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MyfirstprojectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Category cat1 = new Category(1L, "Electronics");
		Category cat2 = new Category(2L, "Books");
		Category cat3 = new Category(3L, "Video-Games");
		Category cat4 = new Category(4L, "Toys");
		Category cat5 = new Category(5L, "SmarthPhones");
		Category cat6 = new Category(6L, "Costumes");
		
		categoryRepository.save(cat1);
		categoryRepository.save(cat2);
		categoryRepository.save(cat3);
		categoryRepository.save(cat4);
		categoryRepository.save(cat5);
		categoryRepository.save(cat6);

	}

}
