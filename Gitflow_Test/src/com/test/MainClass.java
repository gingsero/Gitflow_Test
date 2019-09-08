package com.test;

import java.util.LinkedList;
import java.util.List;

import com.test.func.generic.GenericClassType;
import com.test.func.generic.GenericTestClass;

public class MainClass {

	public static void main(String[] args) {
//		GenericClassType<String> genericType = new GenericClassType<String>("mesuri");
//		genericType.print();
		
		List<String> userlist = new LinkedList<String>();
		userlist.add("김수환무");
		userlist.add("거북이와");
		
		GenericTestClass<List<String>> gen = new GenericTestClass<List<String>>(userlist);
	}

}
