package in.co.rays.exception.uncheck;

public class LoginException extends RuntimeException{
	
	
	public LoginException() {
		super("user not found");
	}

}
