package assignments_package;

public class Aassignment_26 {

	public static void main(String[] args) {
		String input = "shubham";
		String output = "";
		
		for (int i= 7; i>=0; i--) 
		{
			char c1 = input.charAt(i);
			output = output + c1;
		}
			System.out.println(output);
			
		boolean b1 = input.equals(output);
		
		if(b1==true) 
		{
			System.out.println("palindrome");
		}
		else 
		{
			System.out.println("not pallindrome");
		}
	}

}
