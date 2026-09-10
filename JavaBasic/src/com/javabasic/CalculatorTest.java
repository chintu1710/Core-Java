package com.javabasic;

public class CalculatorTest {
	public static void main(String[] args) {
		int a = 12;
		int b = 19;

		String sum = "+";

		switch (sum) {

		case "+":
			System.out.println("Result" + (a + b));
			break;
		case "-":
			System.out.println("Result" + (a - b));
			break;
		case "*":
			System.out.println("Result" + (a * b));
			break;
		case "/":
			System.out.println("Result" + (a / b));
			break;
		case "%":
			System.out.println("Result" + (a % b));
			break;

		}
	}
}
