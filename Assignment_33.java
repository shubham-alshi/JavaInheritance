package assignments_package;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] rollno = new int[4];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of arrays");
		for(int i=0;i<4;i++) 
		{
			rollno[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(rollno));
	

	}

}
