package practise_package;

public class Abstract_Google extends Abstract_Google_Auth
	{
		 public static void dew(int x, int y) 
		{
			System.out.println("Q def should be run in last night");
		}
	
		
		@Override
		void login() {
			
			System.out.println("login should be successfull");
			
		}

		@Override
		void logout() {
			
			System.out.println("logout should be successfull");
			
		}
		

		public static void main(String[] args) {
			Abstract_Google s = new Abstract_Google();
					s.login();
					s.logout();
					dew(12,89);
					
		}



	}


