package in.co.rays.mini.projects;

import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String[] courses = { "BBA/BCom", "Btech", "BPharma", "BA" };

			System.out.println("Enter your class : ");
			int Class = sc.nextInt();

			if (Class == 12) {
				System.out.println("Enter your subject (Art/ Commerce/ Maths): ");
				String stream = sc.next();
				if (stream.equals("Commerce")) {
					System.out.println("you can take  " + courses[0]);
				} else if (stream.equals("Maths")) {
					System.out.println("you can take  " + courses[1]);

				} else if (stream.equals("Bio")) {
					System.out.println("you can take  " + courses[2]);
				} else if (stream.equals("Art")) {
					System.out.println("you can take  " + courses[3]);
				} else {
					System.out.println("OOPs We Have No  Course Thank you for visit");
				}
			} else {
				System.out.println("Only for class 12th Student ");

			}
		}

	}
}
