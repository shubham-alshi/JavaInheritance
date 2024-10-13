package assignments_package;

public class Assignment_49 {

	public static void main(String[] args) {
		String name = "RAM";
		String output = "";
		for(int i =0;i<3;i++) 
		{
			System.out.println(name.charAt(i));
		}
		for(int i=name.length()-1;i>=0;i--) 
		{
			char c1 = name.charAt(i);
			output = output+ c1;
		}
		System.out.println(output);

	}

}
