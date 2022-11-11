package com.scg.training.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.scg.training.vo.StudentVO;

@Configuration
public class StudentConfiguration {

	@Bean
	public StudentVO siniStudent() {
		return new StudentVO("sini", 16);
	}

	@Bean
	@Primary
	public StudentVO jiniStudent() {
		return new StudentVO("jini", 16);
	}
}
