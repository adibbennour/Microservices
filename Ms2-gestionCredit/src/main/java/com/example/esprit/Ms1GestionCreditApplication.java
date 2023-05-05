package com.example.esprit;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import com.example.esprit.Ms1GestionCreditApplication;
import com.example.esprit.entity.Credit;
import  com.example.esprit.repositories.CreditRepositorie;

@SpringBootApplication
@EnableEurekaClient
public class Ms1GestionCreditApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms1GestionCreditApplication.class, args);
	}
	@Bean
	ApplicationRunner start(CreditRepositorie repo)
	{ 
			return  args -> {
				Stream.of(new Credit("credit1","1002"),
						new Credit("Credit2","5000"))
				.forEach(candidat -> 
					{
					repo.save(candidat);
					}					    );
				repo.findAll().forEach(s->System.out.println(s.getNom()));
			
	};
	
}

}
