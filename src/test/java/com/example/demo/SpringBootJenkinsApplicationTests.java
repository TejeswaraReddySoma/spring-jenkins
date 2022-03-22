package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootJenkinsApplicationTests {

	Logger logger=LoggerFactory.getLogger(SpringBootJenkinsApplication.class);
	@Test
	public void contextLoads() {
		logger.info("tesddddt execsutdding");
		assertEquals(true,true);
	}

}
