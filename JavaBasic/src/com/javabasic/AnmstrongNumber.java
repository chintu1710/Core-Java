package com.javabasic;

public class AnmstrongNumber {
	public static void main(String[] args) {
		int num = 153;
		
		int a = num%10;
		int b = (num/10)%10;
		int c = num/100;
		
		int sum = a*a*a + b*b*b + c*c*c;
		
		if (sum == num) {
			System.out.println("this is a amstong number ");
			
		} else {
			System.out.println("this is not amstong number.....................");

		}
		
		
		
	}

}
