package assignments_package;

import java.util.HashMap;
import java.util.Map;

public class Assignment_71 {


	
	    public static void main(String[] args) {
	        Map<String, Integer> fruitMap = new HashMap<>();
	        fruitMap.put("Apple", 50);
	        fruitMap.put("Banana", 30);
	        fruitMap.put("Orange", 40);
	        fruitMap.put("Grapes", 20);

	        String fruitToCheck = "Banana";
	        if (fruitMap.containsKey(fruitToCheck)) {
	            System.out.println(fruitToCheck + fruitMap.get(fruitToCheck));
	        } else {
	            System.out.println(fruitToCheck);
	        }

	        String fruitToRemove = "Orange";
	        if (fruitMap.containsKey(fruitToRemove)) {  //need to check on this
	            fruitMap.remove(fruitToRemove);
	            System.out.println(fruitToRemove);
	        } else {
	            System.out.println(fruitToRemove);
	        }

	        System.out.println("all fruits in the inventory:");
	       
	}


}
