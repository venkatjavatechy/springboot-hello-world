package com.venkat.javatechy.springboothelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHelloWorldApplication.class, args);
	}

	@GetMapping("/greet/{name}")
	public String greet(@PathVariable("name") String name) {
		return "hello!" + name;
	}

	@GetMapping("/welcome")
	public String welcome(String name) {
		return "welcome spring boot programming";
	}

	@GetMapping("/")
	public String index(final Model model) {
		model.addAttribute("title", "Docker + Spring Boot");
		model.addAttribute("msg", "Welcome to the docker container!");
		return "index";
	}


}
