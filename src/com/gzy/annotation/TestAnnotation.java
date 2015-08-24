package com.gzy.annotation;


public class TestAnnotation {
	
	@Test(name = "guozeyuan")
	public static void main(String[] args) {
		Test test = (Test)TestAnnotation.class.getMethods()[0].getAnnotation(Test.class);
		System.out.println(test.name());
	}

}
