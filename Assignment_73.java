package assignments_package;

public class Assignment_73 {
	
	    public static void main(String[] args) {
	  
	        try {
	            String str = null;
	            System.out.println(str.length()); // This will throw NullPointerException
	        } catch (NullPointerException e) {
	            System.out.println("Error: Null pointer exception encountered.");
	        }
	    }
	


}
