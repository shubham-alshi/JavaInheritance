package assignments_package;

class ram
{
 	ram()
 	{
 		System.out.println("jay_shree_ram");
 	}
}

class lakshman extends ram
{
	lakshman()
	{
		super();
		System.out.println("jay_shree_lakshman");
	}
}

public class Assignment_17 extends lakshman {
	
	Assignment_17()
	{
		super();
		System.out.println("Main Method");
	}

	public static void main(String[] args) {
		 new Assignment_17();

	}

}
