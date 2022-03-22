package com.elarrag.mehdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class MusQlApplication {

	public static void main(String[] args) {
		SpringApplication.run(MusQlApplication.class, args);
		
		
	}

}
