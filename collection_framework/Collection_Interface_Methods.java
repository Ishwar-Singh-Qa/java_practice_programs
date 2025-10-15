package collection_framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class Collection_Interface_Methods 
{                              //Hover over Collection's class or its method then cntrl+Click ->To open Class details

	public static void main(String[] args) 
	{                         
		Collection c1 =new ArrayList(); //data type(Without Generic) is not defined hence giving warning messages
		
		c1.add(16);                  //Collection is <I> hence not recommended to create it's object.
		c1.add("November");           //Hence we have done type casting from ArrayList<C> to Collection<I>
		c1.add(true);
		System.out.println(c1);
		
		
		
		Collection<String> c2 = new ArrayList<> (); //HERE collection's data type is defined hence NO WARNING MSG COMING
		c2.addAll(c1);
		System.out.println(c2);
		
		c2.add("Ishu");
		System.out.println(c2);
		
		System.out.println("both Collections are equal= " + c2.equals(c1));
		
		c2.removeAll(c1);       //Removed all values of c1 
		System.out.println(c2);
		
		c2.remove("Ishu");
		System.out.println(c2);
		
		System.out.println("Is it Empty collection = " + c2.isEmpty());
		
		boolean c = c1.contains(16);
		System.out.println("Element Contains = "+ c);
		
		c2.add("Gulati");
		System.out.println(c2);
		boolean clr = c1.containsAll(c2);
				
		System.out.println("All Elements Contains = "+ clr);
		
		c1.clear();      //It clears/deletes all of the elements from the Collection
		System.out.println(c1);
		
		int size = c2.size();
		System.out.println(size); //SIZE starts from 1 and Index starts from 0
		
		c2.add("Good");
		System.out.println(c2);
		c2.retainAll(c2); //Retains only the elements in this Collection that are contained in the specified collection (optional operation). In other words, removesfrom this Collection all of its elements that are not contained in thespecified collection.
		//By writing same collection, there will be no impact on the Collection's elements
		
		System.out.println(c2);
		
		c2.toArray(); //No idea how to use - may be by using foreach loop
		//Object[] array = collection.toArray();
		
		c2.iterator();//how to use iterator() method of Collection interface in java collection framework?
//		Iterator<String> iterator = collection.iterator();
//		while (iterator.hasNext()) {
//		    System.out.println(iterator.next());
//		}
//		
		
		c1.add("Good");
		c1.add("Good");
		c1.add(null);
		c1.add(null);
		System.out.println(c1);
		
		
		//ADDING 2 COLLECTION's ELEMENT DATA IN TO ANOTHER COLLECTION
		Collection<String> c3 = new Vector<String> ();                 //c3+c1+c2
		c3.addAll(c1);
		c3.addAll(c2);
		System.out.println(c3);
		
	//	add(index, element);
		

	
		
		

	}

}
