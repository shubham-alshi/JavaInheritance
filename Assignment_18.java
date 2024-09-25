package assignments_package;

        class Report
		{
        	Report(int a, float b)
		 	{
		 		System.out.println("jay_shree_ram");
		 	}
		}

		class Screen extends Report
		{
			Screen(double x , double y)
			{
				super(415,(float) 20.1);
				System.out.println("jay_shree_lakshman");
			}
		}

		public class Assignment_18 extends Screen {
			
			  Assignment_18()
			  {
				  super(25.33, 52.64);
				  System.out.println("main method");
			  }
			
			
			
		public static void main(String[] args) {
			
			new Assignment_18();
			
}

}
