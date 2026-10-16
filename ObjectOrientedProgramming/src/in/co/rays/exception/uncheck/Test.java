package in.co.rays.exception.uncheck;

public class Test {
	public static void main(String[] args) {
		System.out.println(" Before ");
		String name = "Chintu.";
		try {

			System.out.println(name.charAt(10));

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
		finally {
			System.out.println(407);
		}

		System.out.println(" After...");
		

	}
}
