package assignments_package;

 class Parametrised_Constructor {

	 Parametrised_Constructor(int x , int y)
	{
		 
		 System.out.println("Dell is not good");
	}

	 Parametrised_Constructor(double x , int y)
	{
		 this(44,44 );
		 System.out.println("Dell is not good");
	}
	
	 
    public static void main(String[] args) {
		
    	new Parametrised_Constructor(445.21, 223);

	}

}
