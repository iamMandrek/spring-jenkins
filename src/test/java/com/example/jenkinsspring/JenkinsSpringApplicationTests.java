package com.example.jenkinsspring;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class JenkinsSpringApplicationTests {

	public static Logger LOG = LoggerFactory.getLogger(JenkinsSpringApplicationTests.class);
	@Test
	void contextLoads() {
		LOG.info("Test case executed");
		LOG.info("Test case executed for the second time.");

		assertEquals(true, true);
	}

}
