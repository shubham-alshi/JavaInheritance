package practise_package;

abstract class Abstract_Class_2
{
	abstract void method1();
	abstract void method2();
	void method4() 
	{
		System.out.println("logic for logout from system");
	}
}

 abstract class Abstract_Class_3 extends Abstract_Class_2
{	
	abstract void method3();
	abstract void method5();

	
}

public class Abstract_Class_1 extends Abstract_Class_3 {

	public static void main(String[] args) {
		
		Abstract_Class_1 ac1 = new Abstract_Class_1();
		ac1.method1();
		ac1.method2();
		ac1.method3();
		ac1.method4();
		ac1.method5();
		

	}


	void method3() {
		// TODO Auto-generated method stub
		System.out.println("rama");
	}


	void method5() {
		// TODO Auto-generated method stub
		System.out.println("prabhu");
	}


	void method1() {
		// TODO Auto-generated method stub
		System.out.println("shree");
	}


	void method2() {
		// TODO Auto-generated method stub
		System.out.println("hari");
	}

}
