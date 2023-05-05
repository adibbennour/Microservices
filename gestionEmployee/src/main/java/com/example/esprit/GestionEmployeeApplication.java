package com.example.esprit;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import com.example.esprit.entity.Employee;
import com.example.esprit.repositories.EmployeeRepositorie;
@EnableEurekaClient
@SpringBootApplication
public class GestionEmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionEmployeeApplication.class, args);
	}
	@Bean
	ApplicationRunner start(EmployeeRepositorie repo)
	{ 
			return  args -> {
				Stream.of(new Employee("Mariem","Abdelaali","26","ma@gmail.com"),
						new Employee("Alex","Abdelaali","20","alex@gmail.com"))
				.forEach(employee -> 
					{
					repo.save(employee);
					}					    );
				repo.findAll().forEach(s->System.out.println(s.getFirstName()));
			
	};
	
}
}
