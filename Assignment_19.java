package assignments_package;


class Parent_Class
{
	void login() 
	{
		System.out.println("login  with email id");
	}
	
}


public class Assignment_19 extends Parent_Class {
	
	void login() 
	{
		
		System.out.println("login  with mob no");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_19 cc = new Assignment_19();
		cc.login();
	}

}
