package com.bikkadIt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitBranchDemoApplication {

        String s1="Bikkad";
        String s="Santosh";

	public static void main(String[] args) {
		SpringApplication.run(GitBranchDemoApplication.class, args);
		
		System.out.println("Welcome to bikkad IT");
	}

}
