package assignments_package;

import java.util.Arrays;

public class Assignment_27 {

	public static void main(String[] args) {
		
		//syntax of array
		// dataytpe [] variable = new datatype [4]
		int[] rollno = new  int[5];
		
		rollno[0]=78;
		rollno[1]=23;
		rollno[2]=7;
		rollno[3]=77;
		rollno[9]=45;
		rollno[8]=23;
		rollno[7]=21;
		
		/*for (int i = 0;i<=3;i++) 
		{
			System.out.println(rollno[i]);
		}*/
		System.out.println(Arrays.toString(rollno));
	}

}
