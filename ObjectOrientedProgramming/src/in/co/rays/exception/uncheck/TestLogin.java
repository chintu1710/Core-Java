package in.co.rays.exception.uncheck;

public class TestLogin {
	public static void main(String[] args) {
		
		String login = "Chintu@2006";
		
		if (login == "Chintu@2006") {
			System.out.println("Login Sucessful");
			
		} else {
			
			try {
				throw new LoginException();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}

		}
		
	}

}
