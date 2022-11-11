package com.scg.training.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scg.training.entity.Employee;
import com.scg.training.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	private EmployeeRepository emp;

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

	@PostMapping("/employee")
	public String insert() {
		System.out.println("Hii..");
		final Employee employee = new Employee();
		employee.setEmployeeName("hancepaul");
		employee.setDesignation("HR");
		System.out.println("inserting..");
		emp.save(employee);
		System.out.println("inserting..");
		return "inserted";
	}

}
