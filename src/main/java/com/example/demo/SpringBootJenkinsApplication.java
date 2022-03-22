package com.example.demo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJenkinsApplication {

	Logger logger=LoggerFactory.getLogger(SpringBootJenkinsApplication.class);
	@PostConstruct
	public void intt()
	{
		logger.info("Appldddication started");
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJenkinsApplication.class, args);
	}

}
