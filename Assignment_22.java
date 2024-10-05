package assignments_package;
abstract class op
{
	abstract void ram();
	abstract void lakhan();
}

public class Assignment_22 extends op {
	
	void tin() 
	{
		System.out.println("mouse");
	}
	void bin() 
	{
		System.out.println("all folders are present");
	}
	
	public static void main(String[] args) {
		
		Assignment_22 A22 = new Assignment_22();
		A22.tin();
		A22.bin();
		A22.ram();
		A22.lakhan();

	}
	@Override
	void ram() {
		
		System.out.println("ramakrushna");
		}
	@Override
	void lakhan() {
		
		System.out.println("pandharishethphadke");
		
	}

}
