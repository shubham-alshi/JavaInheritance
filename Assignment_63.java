package assignments_package;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Assignment_63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List c1 = new ArrayList();
		c1.add(100);
		c1.add(78);
		c1.add(10);
		c1.add("RAM");
		c1.add('s');
		c1.add(true);
		
		ListIterator i1 = c1.listIterator();
		System.out.println("backward");
		
		while(i1.hasPrevious()) 
		{
			System.out.println(i1.previous());
		}
		
	}

}
