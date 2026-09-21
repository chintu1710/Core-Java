package com.javabasic;

public class PrimeNumber {
	public static void main(String[] args) {

		for (int num = 3; num <= 100; num++) {
			boolean isprime = true;

			for (int i = 3; i <= num / 2; i++) {
				if (num % i == 0) {
					isprime = false;
					break;

				}

			}
			if (isprime) {
				System.out.println(num + "");

			}

		}
	}

}
