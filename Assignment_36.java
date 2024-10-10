package assignments_package;

import java.util.Arrays;

public class Assignment_36 {
	static int count_of_alphabet;
	static int count_of_numeric;
	static int count_of_space;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "KV $ NO 2 BANGLORE";
		
		char[] c1 = input.toCharArray();
		
		for(int i=0; i<input.length(); i++) 
		{
		boolean b1 = 	Character.isAlphabetic(c1[i]);
		
		if (b1==true) 
		{
			count_of_alphabet++;
		}
		
		}
		System.out.println(count_of_alphabet);
		
		for(int i=0; i<input.length(); i++) 
		{
		boolean b1 = 	Character.isDigit(c1[i]);
		
		if (b1==true) 
		{
			count_of_numeric++;
		}
		}
		System.out.println(count_of_numeric);
		
		
		for(int i=0; i<input.length(); i++) 
		{
		boolean b1 = Character.isWhitespace(c1[i]);
		
		if (b1==true) 
		{
			count_of_space++;
		}
		}
		System.out.println(count_of_space);
		
		int count_of_special_character = input.length() - (count_of_alphabet + count_of_numeric + count_of_space );
		System.out.println(count_of_special_character);
		

	}

}
