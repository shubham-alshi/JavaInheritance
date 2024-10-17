package assignments_package;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Assignment_61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c1 = new ArrayList();
		c1.add(100);
		c1.add(78);
		c1.add(10);
		c1.add("RAM");
		c1.add('s');
		c1.add(true);
		
		Iterator i1 =  c1.iterator();
		while(i1.hasNext()) 
		{
			System.out.println(i1.next());
		}
	}

}
