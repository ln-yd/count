package com.leslie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CounterApplication {
	
	public CounterApplication() {
		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(CounterApplication.class, args);
	}

}
