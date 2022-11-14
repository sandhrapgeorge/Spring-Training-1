package com.scg.training;

public class GenericClass<T> {

	T obj;

	public void add(final T obj) {
		this.obj = obj;
	}

	public T get() {
		return obj;
	}

}
