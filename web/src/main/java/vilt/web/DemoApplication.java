package vilt.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication 
@EnableJpaRepositories(basePackages = {"vilt.persistence"})
@EntityScan(basePackages = {"vilt.domain"})
@ComponentScan(basePackages = {"vilt.persistence","vilt.domain","vilt.web"})

public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class);
	}

}
