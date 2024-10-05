package assignments_package;

interface one
{
	 void add(); 	
}
interface two
{
	 void subtracts();
}
interface three
{
	 void division();
}
	
public class Assignment_24 implements one, two, three {
	
	void mul() 
	{
		System.out.println("multiplication exists");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assignment_24 A24 = new Assignment_24();
		A24.subtracts();
		A24.add();
		A24.mul();
		A24.division();
		

	}

	@Override
	public void subtracts() {
		// TODO Auto-generated method stub
		System.out.println("Good Implementations");
		
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Bad Implementations");
		
	}


	@Override
	public void division() {
		// TODO Auto-generated method stub
		System.out.println("great semifinal ever");
		
	}

}
