package com.scg.training.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.scg.training.Cat;
import com.scg.training.Printer;

@Controller
public class GenericController {

	@GetMapping("generics")
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
		wildCard();

		return "inserted";
	}

	public void genericClass() {// generic classes will not work with primitive data types.
//		final Printer<Double> genericClassVar1 = new Printer<>(490.5);
//		genericClassVar1.print();
//		Printer<String> genericClassVar2=new Printer<>("Hi...");
//		genericClassVar2.print();
		final Printer<Cat> var3 = new Printer<>(new Cat());
		var3.print();
	}

	public void genericMethod() {
		final Integer[] intArray = { 10, 20, 30, 40, 50 };
		final Character[] charArray = { 's', 'i', 'n', 'i' };

		System.out.println("Printing Integer Array");
		printArray(intArray);

		System.out.println("Printing Character Array");
		printArray(charArray);

		shout("Happyyy..", 89);
	}

	public static void wildCard() {
		final List<Integer> l1 = new ArrayList<>();
		l1.add(10);
		l1.add(20);
		System.out.println("displaying the sum= " + add(l1));

		final List<Double> l2 = new ArrayList<>();
		l2.add(30.0);
		l2.add(40.0);
		System.out.println("displaying the sum= " + add(l2));

	}

	public static <E> void printArray(final E[] elements) {
		for (final E element : elements) {
			System.out.println(element);
		}
		System.out.println();
	}

	public static Double add(final List<? extends Number> list) {
		double sum = 0.0;

		for (final Number n : list) {
			sum = sum + n.doubleValue();
		}

		return sum;
	}

	public static <T, V> void shout(final T thingsToShout, final V otherThingsToShout) {
		System.out.println(thingsToShout + ".......");
		System.out.println(otherThingsToShout + "******");
	}

}

//The T type indicates that it can refer to any type (like String, Integer, and Employee).
//The type you specify for the class will be used to store and retrieve the data.

//Using List<? extends Number> is suitable for a list of type Number or any of its subclasses whereas List<Number>
//works with the list of type Number only. So, List<? extends Number> is less restrictive than List<Number>.
//
