package com.example.spring.boot.docker.git.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RameshDockerGitApplication {
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to java Techie !!";
	}
	
//	echo "# Docker-Jenkins-Git" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/Ramesh84hk/Docker-Jenkins-Git.git
//	git push -u origin main
//	
	public static void main(String[] args) {
		SpringApplication.run(RameshDockerGitApplication.class, args);
	}

}
