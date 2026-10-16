package in.co.rays.exception.uncheck;

import javax.management.RuntimeErrorException;

public class ExceptionHandlingUncheck {
	
	public static void main(String[] args) {
		dad ();
	}

	private static void dad() {
		try {
			mom();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	private static void mom() {
		son();
		
	}

	private static void son() {
		throw new RuntimeException("make a misktake");
		
	}

}
