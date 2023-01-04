package com.package1;

public class Class1 {
	
	public String method1() {
		String message ="Hello All - Welcome to 2023";
		System.out.println("Wish you a happy new year");
		System.out.println(message);
		System.out.println("Thank you");
		return message;
		
	}

	public static void main(String[] args) {
		Class1 c = new Class1();
		c.method1();

	}

}
