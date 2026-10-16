package in.co.rays.exception.uncheck;

public class ExceptionHandlingCheck {
	
	
	public static void main(String[] args) {
		
		try {
			dad();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void dad() throws Exception {
		mom();	
	}

	private static void mom() throws Exception {
		son();
		
	}

	private static void son() throws Exception {
		throw new Exception("mistake hai...............");
	}

}
