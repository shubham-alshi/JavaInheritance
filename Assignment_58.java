package assignments_package;
import java.util.Scanner;

public class Assignment_58 {

	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter first number: ");
	        double num1 = sc.nextDouble();
	        
	        System.out.print("Enter second number: ");
	        double num2 = sc.nextDouble();
	        
	        System.out.println("Choose operation: 1. Add 2. Subtract");
	        int choice = sc.nextInt();
	        
	        double result;
	        
	        switch (choice) {
	            case 1: result = num1 + num2; break;
	            case 2: result = num1 - num2; break;
	            
	            
	           
	        }
	        System.out.println(result);
	        
	
	        
	        sc.close();
	    }
	}


