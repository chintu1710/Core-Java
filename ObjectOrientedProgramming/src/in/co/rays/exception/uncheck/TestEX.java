package in.co.rays.exception.uncheck;

public class TestEX {
	
	public static void main(String[] args) {
		
		String a = "HEllo";
		
		try {
			System.out.println(a.charAt(10));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
