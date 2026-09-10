package com.javabasic;

public class PalindromTwo {
	public static void main(String[] args) {
		int num = 151;
		int num2 = num;
		int r = 0;
		int sum = 0;

		while (num2 != 0) {
			r = num2 % 10;
			sum = (sum * 10) + r;
			num2 = num2 / 10;

		}
		System.out.println("reverese number." + sum);
		if (sum == num) {
			System.out.println(sum + "it is Plindrom");

		} else {
			System.out.println(sum + "it is Plindrom");

		}

	}

}
