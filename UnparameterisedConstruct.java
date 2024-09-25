package assignments_package;

public class UnparameterisedConstruct  {
	
	UnparameterisedConstruct()
	{
		this(25);
		System.out.println("1st");
	}
	
	UnparameterisedConstruct(int a)
	{
		
		System.out.println("2nd");
	}
	
	public static void main(String[] args) {
		
		new UnparameterisedConstruct();
		
		
	}

}