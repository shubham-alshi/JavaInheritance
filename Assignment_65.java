package assignments_package;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Assignment_65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l1 = new ArrayList();
		
		l1.add(100);
		l1.add(78);
		l1.add(10);
		l1.add("RAM");
		l1.add('s');
		l1.add(true);
		
		ListIterator l2 = l1.listIterator();
		while(l2.hasNext()) 
		{
			System.out.println(l2.next());
		}
		while(l2.hasPrevious()) 
		{
			System.out.println(l2.previous());
		}
	}

}
