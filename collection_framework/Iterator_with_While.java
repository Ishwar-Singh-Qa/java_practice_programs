package collection_framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iterator_with_While {

	public static void main(String[] args) 
	{
		Collection c1 = new ArrayList();
		
		c1.add(16);
		c1.add('M');
		c1.add("Ishwar");
		
		System.out.println(c1);
		
		Iterator it = c1.iterator();  //Iterator means repititions and  getting the element one by one
		while(it.hasNext())
		{
			System.out.println(it.next());  //no need to write increment in another line
		}
		

	}

}
