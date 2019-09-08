package com.test.func.generic;

public class GenericClassType<T> {
	T info;
	
	public GenericClassType(T info){
		this.info = info;
	}
	
	public void print() {
		System.out.println("Generic info variable type : " + judgeType());
	}
	
	private String judgeType() {
		String result = "";
		if(this.info instanceof String) {
			result = "String";
		} else if (this.info instanceof Integer) {
			result = "Integer";
		} 
		
		return result;
	}
}
