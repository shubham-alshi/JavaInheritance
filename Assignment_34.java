package assignments_package;

public class Assignment_34 {

	public static void main(String[] args) {
		int[] rollno = new int[4];
		rollno[0]=74;
		rollno[1]=45;
		rollno[2]=69;
		rollno[3]=82;
		
		int notocheck = 78;
		
		for (int i=0;i<4;i++)
		{
			if (notocheck == rollno[i]) 
			{
				System.out.println(" value is present inside the arrays");
			}
			else 
			{
				System.out.println("value is not present in that arrays");
			}
		}
	

	}

}
