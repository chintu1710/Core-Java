package in.co.rays.exception.uncheck;

public class Login {

		private String login;

		public String getLogin() {
			return login;
		}

		public void setLogin(String login) {
			this.login = login;
		}
		
		
		public void checkLogin() {
			if (login.equals(login)) {
				throw new AccessDenite("Access Denite");
				
			} else {
				System.out.println("Welcome"+ login);
			}
		}

	
		
}
