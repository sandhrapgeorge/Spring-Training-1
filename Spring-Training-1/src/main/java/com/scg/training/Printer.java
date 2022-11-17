package com.scg.training;

public class Printer<T extends Animal & AnimalName> {

	T thingsToPrint;

	public Printer(final T thingsToPrint) {
		this.thingsToPrint = thingsToPrint;
	}

	public void print() {
		System.out.println(thingsToPrint.eat());
		System.out.println(thingsToPrint.nameprint());
		System.out.println(thingsToPrint);
	}

}
