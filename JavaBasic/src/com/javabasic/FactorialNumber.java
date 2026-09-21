package com.javabasic;

public class FactorialNumber {
	public static void main(String[] args) {

		int num1 = 7;
		int fact = 1;

		for (int i = 1; i <= num1; i++) {
			fact = fact * i;
		
		}
		System.out.println(fact);

		
	}
}
