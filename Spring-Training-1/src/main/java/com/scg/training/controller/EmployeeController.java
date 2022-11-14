package com.scg.training.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scg.training.GenericClass;

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
		System.out.println("Hii");
		final List list = new ArrayList();
		// list.add(10);
		list.add("10");
		final String s = (String) list.get(0);
		System.out.println(s);

		final List<Integer> list1 = new ArrayList<>();
		list1.add(10);
		// list1.add("10");//compile time error
		// String s1 = list1.get(0);

		genericClass();
		genericMethod();

		return ("nicknames is:" + nicknames[1]);
	}

	public void genericClass() {
		final GenericClass<Double> genericClassVar = new GenericClass<>();
		genericClassVar.add(98.5);
		// genericClassVar.add("hiiii");
		System.out.println(genericClassVar.get());
	}

	public void genericMethod() {
		final Integer[] intArray = { 10, 20, 30, 40, 50 };
		final Character[] charArray = { 's', 'i', 'n', 'i' };

		System.out.println("Printing Integer Array");
		printArray(intArray);

		System.out.println("Printing Character Array");
		printArray(charArray);
	}

	public static <E> void printArray(final E[] elements) {
		for (final E element : elements) {
			System.out.println(element);
		}
		System.out.println();
	}

	public static void wildCard(final List<? extends Number> lists){
		for(final Number s:lists){
			System.out.println(s );//calling method of Shape class by child class instance
		}

}
//The T type indicates that it can refer to any type (like String, Integer, and Employee).
//The type you specify for the class will be used to store and retrieve the data.
