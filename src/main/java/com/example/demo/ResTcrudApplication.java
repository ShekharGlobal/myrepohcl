package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.entity.Product;
import com.example.repository.ProductRepository;

@SpringBootApplication
@ComponentScans({@ComponentScan("com.example.controller"),@ComponentScan("com.example.service")})
@EntityScan("com.example.entity")
@EnableJpaRepositories("com.example.repository")
public class ResTcrudApplication implements CommandLineRunner{
	
	@Autowired
	ProductRepository productRepository;
	public static void main(String[] args) {
		SpringApplication.run(ResTcrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Product p=new Product();
		p.setName("HackerRank");
		p.setPrice(23445);
		productRepository.save(p);
		
	}

}
