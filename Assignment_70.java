package assignments_package;

import java.util.HashMap;
import java.util.Map;

public class Assignment_70 {

	

	    public static void main(String[] args) {
	        Map<String, Integer> map = new HashMap<>();
	        map.put("Apple", 10);
	        map.put("Banana", 20);
	        map.put("Orange", 30);
	       
	        for (Map.Entry<String, Integer> entry : map.entrySet()) {
	            System.out.println(entry.getKey() + entry.getValue());
	        }
	    }
	}


