package assignments_package;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Assignment_69 {
	
	
	
	    public static void main(String[] args) {
	        Map<String, Integer> map = new HashMap<>();
	        map.put("Apple", 10);
	        map.put("Banana", 20);
	        map.put("Orange", 30);
	        

	        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
	        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();

	        while (iterator.hasNext()) {
	            Map.Entry<String, Integer> entry = iterator.next();
	            System.out.println(entry.getKey()+ entry.getValue());
	        }}
	    }
	



