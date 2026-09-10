package com.javabasic;

import java.util.Scanner;

public class OnlineCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number ");
		int a = sc.nextInt();

		System.out.println("Enter a number ");
		int b = sc.nextInt();

		System.out.println("Enter Symbol");
		String sum = sc.next();

		switch (sum) {

		case "+":
			System.out.println("result" + (a + b));
			break;
		case "*":
			System.out.println("result" + (a * b));
			break;
		case "-":
			System.out.println("result" + (a - b));
			break;
		case "/":
			System.out.println("result" + (a / b));
			break;
		case "%":
			System.out.println("result" + (a % b));
			break;
		default:
			System.out.println("invalid sumbol");
		}

	}

}
