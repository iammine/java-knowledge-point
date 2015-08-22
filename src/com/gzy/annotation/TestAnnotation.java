package com.gzy.annotation;


public class TestAnnotation {
	
	@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = (Test)TestAnnotation.class.getAnnotation(Test.class);
		System.out.println(test.name());
	}

}
