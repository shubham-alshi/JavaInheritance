package practise_package;

import assignments_package.Assignment_56;

public class Assignment_56_1 extends Assignment_56{

		
		
		    public void displayChildAccess() {
		        // Cannot access private or default variables
		        // Can access protected and public variables directly
		        System.out.println(protectedVar);
		        System.out.println(publicVar);
		    }

		    public static void main(String[] args) {
		    	Assignment_56_1 child = new Assignment_56_1();
		        child.displayChildAccess();
		    }
		


	}


