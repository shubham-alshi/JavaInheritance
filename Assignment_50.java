package assignments_package;

import java.util.Date;

public class Assignment_50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1 = new Date();
		long l1 = d1.getTime();
		System.out.println(l1); //EPOCH CONVERTER
		Date d2 = new Date(d1.getTime());
		System.out.println(d2);
		String d3 = d2.toString();
		String current_month = d3.substring(4,7);
		System.out.println(current_month);
		String current_year = d3.substring(23,28);
		System.out.println(current_year);
		System.out.println(current_year.trim());
		
		String String_date_format =   current_month + "  " + current_year.trim();
		System.out.println(String_date_format);
		
		//for future time
		
		Date d4 = new Date(d1.getTime() + (1000*60*60*24*4));
		System.out.println(d4);
		
		

	}

}
