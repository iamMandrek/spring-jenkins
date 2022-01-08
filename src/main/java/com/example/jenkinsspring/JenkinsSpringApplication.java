package com.example.jenkinsspring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsSpringApplication {

	public static Logger LOG = LoggerFactory.getLogger(JenkinsSpringApplication.class);
	@PostConstruct
	public void init(){
		LOG.info("Application started..");
	}
	public static void main(String[] args) {
		LOG.info("Application executed");
		SpringApplication.run(JenkinsSpringApplication.class, args);
	}

}
