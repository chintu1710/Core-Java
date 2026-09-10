package com.javabasic;

public class AnmstrongFive {
	public static void main(String[] args) {
		int num = 54748;
		
		int a = num%10;
		int b = (num/10)%10;
		int c = (num/10)%100;
		int d = (num/10)%1000;
		int e = (num/10)%100000;
		
		int sum = a*a*a*a*a + b*b*b*b*b + c*c*c*c*c* + d*d*d*d*d + e*e*e*e*e;
		
		if (num == sum ) {
			System.out.println("it is a amstong num");
			
		} else {
			System.out.println("it is not amstong number......... ");

		}
	}

}
