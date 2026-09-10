package com.javabasic;

public class PalindromThree {
	public static void main(String[] args) {
		
		int num = 191;
		int num2 = num;
		int r = 0;
		int sum = 0;
		
		while (num2 != 0) {
			r = num2 % 10;
			sum = (sum * 10) + r;
			num2 = num2/10;
			
				}
		System.out.println(sum + "reverse");{
			if (num == sum) {
				System.out.println(sum + "this number is palindrom");
				
			} else {
					
				System.out.println(sum + "this number is not palindrom");

			}
		}
	}

}
