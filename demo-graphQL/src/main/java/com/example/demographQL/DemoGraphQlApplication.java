package com.example.demographQL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoGraphQlApplication {

	private static final Logger logger = LoggerFactory.getLogger(DemoGraphQlApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(DemoGraphQlApplication.class, args);
		logger.info("-----COMPLETED------");
	}

}
