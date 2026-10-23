package com.rays.basics;

import java.util.Scanner;

public class TestifCondition {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int money = sc.nextInt();

		if (money > 100000) {
			System.out.println("Bying new phone");
		} else {
			System.out.println("thank you visit again ");

		}

	}

}
