package com.scg.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringTraining1Application {

	public static void main(final String[] args) {

		final ConfigurableApplicationContext context = SpringApplication.run(SpringTraining1Application.class, args);
	}

}