package com.test.func.generic;

import java.util.List;

public class GenericTestClass<T> {
	T list;

	public GenericTestClass(T list) {
		this.list = list;
	}
	
	public void printList() {
		
	}
	
	/*
	 * public void callList(List<Integer> list) {
	 * 
	 * }
	 * 
	 * public void callList(List<String> list) {
	 * 
	 * }
	 */
}
