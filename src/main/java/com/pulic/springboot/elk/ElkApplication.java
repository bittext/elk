package com.pulic.springboot.elk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElkApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElkApplication.class, args);
		System.out.println("ELK Application started ....");
	}

}
