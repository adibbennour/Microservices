package com.example.esprit;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import com.example.esprit.Ms1GestionCompteApplication;
import com.example.esprit.entity.Compte;
import  com.example.esprit.repositories.CompteRepositorie;

@SpringBootApplication
@EnableEurekaClient
public class Ms1GestionCompteApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms1GestionCompteApplication.class, args);
	}
	@Bean
	ApplicationRunner start(CompteRepositorie repo)
	{ 
			return  args -> {
				Stream.of(new Compte("Feriel","MK"),
						new Compte("Hich","BAMR"))
				.forEach(compte -> 
					{
					repo.save(compte);
					}					    );
				repo.findAll().forEach(s->System.out.println(s.getNom()));
			
	};
	
}

}
