package com.sangupta.springsample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sangupta.jerry.ApplicationContext;

@SpringBootApplication
public class SpringSampleApp {
	
	/**
	 * My private logger instance
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringSampleApp.class);

	/**
	 * Start the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		LOGGER.info("Starting Spring Sample Application Version: {}", ApplicationContext.PROJECT_VERSION);
		SpringApplication.run(SpringSampleApp.class, args);
	}
}
