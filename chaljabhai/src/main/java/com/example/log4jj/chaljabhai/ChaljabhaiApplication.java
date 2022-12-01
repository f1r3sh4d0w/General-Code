package com.example.log4jj.chaljabhai;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChaljabhaiApplication {

	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(ChaljabhaiApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ChaljabhaiApplication.class, args);
		logger.info("Hello WOrld!");
		logger.trace("We've just greeted the user!");
        logger.debug("We've just greeted the user!");
        logger.info("We've just greeted the user!");
        logger.warn("We've just greeted the user!");
        logger.error("We've just greeted the user!");
	}

}
