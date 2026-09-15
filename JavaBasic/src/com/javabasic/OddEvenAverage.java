package com.javabasic;

public class OddEvenAverage {
	public static void main(String[] args) {
		int n = 7;

		int sum = 0;
		int start = 1;

		for (int i = 0; i < n; i++) {
			int odd = n + (2 * i);
			sum += odd;
		

		}
		double avg = (double) sum/n;
		System.out.println(n + avg);
	}

}
