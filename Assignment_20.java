package assignments_package;


class Child_Class
{
	void login() 
	{
		System.out.println("login  with email id");
	}


}
public class Assignment_20 extends Child_Class {
	
	void login() 
	{
		super.login();
		System.out.println("login  with mob no");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_20 cc = new Assignment_20();
		cc.login();
	}

}
