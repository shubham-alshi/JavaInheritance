package assignments_package;

import java.util.Arrays;

public class Assignment_32 {

	public static void main(String[] args) {
		int[] rollno1 = new int[4];
		rollno1[0]=74;
		rollno1[1]=58;
		rollno1[2]=69;
		rollno1[3]=78;
		
		int[] rollno2 = new int[4];
		rollno2[0]=74;
		rollno2[1]=58;
		rollno2[2]=69;
		rollno2[3]=78;
		
		boolean b1 = Arrays.equals(rollno1, rollno2);
		System.out.println(b1);
		if(b1 == true) 
		{
			System.out.println("both arrays are equal");
		}
		else 
		{
			System.out.println("not equal");
		}
		

	}

}
