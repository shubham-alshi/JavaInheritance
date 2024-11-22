package assignments_package;

import java.util.HashMap;
import java.util.Map;

public class Assignment_72 {
	
	


	    public static void main(String[] args) {
	        Map<Integer, String> studentMap = new HashMap<>();
	        studentMap.put(101, "Alice");
	        studentMap.put(102, "Bob");
	        studentMap.put(103, "Charlie");
	        studentMap.put(104, "David");

	        int rollNoToCheck = 102;
	        String nameToCheck = "Bob";

	        if (studentMap.containsKey(rollNoToCheck) && studentMap.get(rollNoToCheck).equals(nameToCheck)) {
	            System.out.println( rollNoToCheck + nameToCheck );
	        } else {
	            System.out.println(rollNoToCheck + nameToCheck );
	        }
	    
	}


}
