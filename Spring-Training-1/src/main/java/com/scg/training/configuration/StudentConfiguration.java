package com.scg.training.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.scg.training.vo.StudentDetailsVO;

@Configuration
public class StudentConfiguration {

	@Bean
	public StudentDetailsVO siniStudent() {
		return new StudentDetailsVO("read", Double.valueOf(15.5d));
	}

	@Bean
	@Primary
	public StudentDetailsVO jiniStudent() {
		return new StudentDetailsVO("write", Double.valueOf(30.6d));
	}
}
