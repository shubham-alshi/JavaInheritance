package assignments_package;

class mon
{
	static void we() 
	{
		System.out.println("INDIA");
	}
	void are()
	{
		System.out.println("London");
	}
}
class tue extends mon
{
	static void june() 
	{
		System.out.println("leap year");
	}
	void april() 
	{
		System.out.println("not leap year");
	}
}
public class Assignment_16 extends tue {
	 
	void number() 
	{
		System.out.println("zero");
	}

	public static void main(String[] args) 
	{
		
		mon m1 = new mon();
		m1.are();
		tue t1 = new tue();
		t1.april();
		Assignment_16 a16 = new Assignment_16();
		a16.number();
		
		june();
		we();
		
	}

}
