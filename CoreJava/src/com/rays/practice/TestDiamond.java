package com.rays.practice;

public class TestDiamond {

	public static void main(String[] args) {

		// for row 1

		for (int j = 1; j <= 4; j++) { // space

			System.out.print("\t");

		}

		for (int k = 1; k <= 1; k++) { // *

			System.out.print("*");

		}

		System.out.println();
		System.out.println();

		// for row 2

		for (int j = 1; j <= 3; j++) { // space

			System.out.print("\t");

		}

		for (int k = 1; k <= 3; k++) { // *

			System.out.print("*" + "\t");

		}

		System.out.println();
		System.out.println();

		// for row 3

		for (int j = 1; j <= 2; j++) { // space

			System.out.print("\t");

		}

		for (int k = 1; k <= 5; k++) { // *

			System.out.print("*" + "\t");

		}

		System.out.println();
		System.out.println();

		// for row 4

		for (int j = 1; j <= 1; j++) { // space

			System.out.print("\t");

		}

		for (int k = 1; k <= 7; k++) { // *

			System.out.print("*" + "\t");

		}

		System.out.println();
		System.out.println();

		// for row 5

		for (int j = 1; j <= 0; j++) { // space

			System.out.print("\t");

		}

		for (int k = 1; k <= 9; k++) { // *

			System.out.print("*" + "\t");

		}

	}

}