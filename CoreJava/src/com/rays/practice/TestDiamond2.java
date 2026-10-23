package com.rays.practice;

public class TestDiamond2 {

	public static void main(String[] args) {

		int m = 4;

		for (int i = 1; i <= 5; i++) { // row

			for (int j = 1; j <= m; j++) { // space

				System.out.print("\t");

			}

			for (int k = 1; k <= (i * 2) - 1; k++) { // *

				System.out.print("*" + "\t");

			}

			System.out.println();
			System.out.println();

			m--;
		}
	}

}