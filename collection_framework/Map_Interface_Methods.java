package collection_framework;

import java.util.HashMap;
import java.util.Map;

public class Map_Interface_Methods {

	public static void main(String[] args) 
	{
		// Map m1 = new HashMap();     //Generic/Raw is not Recommended
		
		Map<String,Integer> m1 =  new HashMap<> ();    //Double likhte to .0 lgana zaruri hota hai.

		m1.put("Aman", 10000);
		m1.put("Deepak", 14000);
		m1.put("Bunty", 20000);
		m1.put("Chetan", 18000);
		m1.put("Aman", 9000);    //This key will modify the value of older Key
		m1.put(null, 11);
		m1.put(null, 12);        //This key will modify the value of older Key
		
		System.out.println(m1);
		
		Map<String,Integer> m2 =  new HashMap<> ();
		m2.put("Gulati", 16);
		
		m2.putAll(m1);
		System.out.println(m2);
		
		System.out.println("Is m2 Empty= " + m2.isEmpty());
		
		m2.remove("Chetan");          //one remove method of Map<I>
		m2.remove("Bunty", 20000);    //another remove method of Map<I>
		System.out.println(m2);
		
		System.out.println(m1.get("Aman"));  //get() - To get the value of a given Key
		
		System.out.println(m2.size());   //Aman sigle ki count hoga becoz vo duplicate hai
		
		
		System.out.println(m2.containsValue(16)); //contains(), its RT is boolean
		
		m1.replace("Deepak", 16000);   //Deepak key's value will be replaced from 14000 to 16000
		System.out.println(m1);
		
	}

}
