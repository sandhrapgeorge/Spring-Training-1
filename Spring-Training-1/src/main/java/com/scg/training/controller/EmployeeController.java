package com.scg.training.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Value("${some.employeename:jibi}")
	private String employeename;

	@Value("${some.age}")
	private int age;

	@Value("${some.havingpet:false}")
	private boolean havingpet;

	@Value("${some.hight:11.3d}")
	private double hight;

	@Value("#{'${some.nicknames:mariya,ammu,kunji}'.split(',')}")
	private String[] nicknames;

	@GetMapping("testing/values")
	public String getFoos() {
		return ("nicknames is:" + nicknames[1]);
	}

}
