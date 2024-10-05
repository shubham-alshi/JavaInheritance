package assignments_package;
class SuperMost
{
	void ram() 
	{
		System.out.println("jayshreeram");
	}
	void shree() 
	{
		System.out.println("jayshreeradhe");
	}
}
abstract class Abs extends SuperMost
{
	abstract void reo();	
	abstract void tre();	
	void mk() 
{
	System.out.println("jayshreeram");
}
	void pl() 
{
	System.out.println("jayshreeradhe");
}

}
public class Assignmetn_23 extends Abs {
	void min() 
{
	System.out.println("clock is Imp");
}
	void sec() 
{
	System.out.println("Time is most Imp");
}
	

	public static void main(String[] args) {
		
		Assignmetn_23 A23 = new Assignmetn_23();
		A23.ram();
		A23.shree();
		A23.reo();
		A23.tre();
		A23.mk();
		A23.pl();
		A23.min();
		A23.sec();
	

	}
	@Override
	void reo() {
		// TODO Auto-generated method stub
		System.out.println("koplar");
	}
	@Override
	void tre() {
		// TODO Auto-generated method stub
		System.out.println("moplar");
	}

}
