package com.javabasic;

public class ArrayWithdrawlSystem {
	public static void main(String[] args) {

		int amount = 2550;
		int[] notes = {500, 1000, 2000, 50};
		int count = 0;

		for (int i = 0; i < notes.length; i++) {

			count = amount / notes[i];

			if (count > 0) {
				System.out.println(notes[i] + "=" + count);

				amount = amount % notes[i];
			}
		}
	}

}
