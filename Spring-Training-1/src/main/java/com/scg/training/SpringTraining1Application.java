package com.scg.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.scg.training.configuration.StudentConfiguration;

@SpringBootApplication
public class SpringTraining1Application {

	public static void main(final String[] args) {

		final ConfigurableApplicationContext context = SpringApplication.run(SpringTraining1Application.class, args);
		final StudentConfiguration c = context.getBean(StudentConfiguration.class);
		// System.out.println(c);
		System.out.println(c.jiniStudent());

	}

}