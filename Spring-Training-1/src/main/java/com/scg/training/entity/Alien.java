package com.scg.training.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@NoArgsConstructor
@Component
//@Scope(value = "prototype")
public class Alien {
	public Alien() {
		System.out.println("object created");
	}

	private int aid;
	private String aname;
	private String atech;
	@Autowired
	@Qualifier("laptop")
	private Tools tools;

	public void show() {
		System.out.println("inside show");
		tools.compile();

	}

}

//Consider marking one of the beans as @Primary, updating the consumer to accept multiple beans,
//or using @Qualifier to identify the bean that should be consumed
