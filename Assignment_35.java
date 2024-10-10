package assignments_package;

import java.util.Arrays;

public class Assignment_35 {

	public static void main(String[] args) {
		//check the given string anagram or not based on the length
		String s1 = "ram";
		String s2 = "arm";
		
		if (s1.length()!= s2.length()) 
		{
			System.out.println("Given String is not anagram");
		}
		else 
		{
			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();
			
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			//main function
			Arrays.sort(c1);
			Arrays.sort(c2);
			boolean b1 = Arrays.equals(c1, c2);
			if(b1==true) 
			{
				System.out.println("Given string is anagram");
			}
			else 
			{
				System.out.println("given string is not anagram");
			}
			
			
		}
		
		

	}

}
