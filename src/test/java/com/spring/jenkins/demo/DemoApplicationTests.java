package com.spring.jenkins.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {
	Logger logger = LoggerFactory.getLogger(DemoApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("test case executing...");
		assertEquals(true, true);
	}

}
