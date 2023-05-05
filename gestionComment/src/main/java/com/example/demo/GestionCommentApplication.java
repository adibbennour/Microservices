package com.example.demo;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Comment;
import com.example.demo.repositories.CommentRepositorie;
@EnableEurekaClient
@SpringBootApplication
public class GestionCommentApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionCommentApplication.class, args);
	}

	@Bean
	ApplicationRunner start(CommentRepositorie repo)
	{ 
			return  args -> {
				Stream.of(new Comment("Welcome to our bank"),
						new Comment("a new comment"))
				.forEach(comment -> 
					{
					repo.save(comment);
					}					    );
				repo.findAll().forEach(s->System.out.println(s.getComment()));
			
	};
	
	}
}
