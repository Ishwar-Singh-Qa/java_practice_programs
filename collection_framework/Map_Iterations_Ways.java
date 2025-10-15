package collection_framework;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_Iterations_Ways {

	public static void main(String[] args) 
	{
		Map<Integer,String> m1 = new HashMap<> ();
		m1.put(1, "One");
		m1.put(3, "Three");
		m1.put(4, "Four");
		m1.put(2, "Two");
		
		System.out.println(m1);
		
// Way of Iteration to "Keys"  --------------------------------------
		
		Set<Integer> si= m1.keySet(); //keySet() RT is Set but Set's type is dependent on m1's keys's data type
		for(Integer i1 : si)           //Integer will be used, since we can't use primitive data type i.e. int
		{
			System.out.println(i1);
		}

// Way of Iteration to "Values" ----------------------------------------
		
		Collection<String> cs=m1.values();  //keySet() RT is Collection but Collection's type is dependent on m1's value's data type
		
		for(String i2:cs)
		{
			System.out.println(i2);
		}
		
// Way of Iteration to "Keys" & "Values" together -----------------------
		
		Set<Map.Entry<Integer,String>> ent =m1.entrySet();  //Map.Entry likhna is must else it gives Complier error
		
		for(Map.Entry<Integer,String> i3 :ent) //here i3 RT is "Map.Entry<Integer,String>"
		{
			System.out.println(i3);            //Entry<I> is also an Interface
		}
		
//Iteration Using iterator() method just like in List<I> ---------------------
		
		
		Iterator<Integer> it4=m1.keySet().iterator();
		
		while(it4.hasNext())
		{
			System.out.println("using iterator() method =" + it4.next());
		}
		
		
//Que - Why we were able to use the iterator() in Map<I>
//Ans : May be because keyValues(),values() and entrySet() methods ki RT Set<I> ya Collection<I> thi, and inme interator() already hota hi hai.
		
//		NOTE : WE CAN USE iterator() with  all these methods : entrySet(), keySet(), or values()

	}

}
