package collection_framework;

import java.util.Enumeration;
import java.util.Vector;

public class Vector_With_Enumeration {

	public static void main(String[] args) 
	{
		Vector v1 = new Vector();
		v1.add(1991);
		v1.add("Year");
		v1.addElement("My");
		System.out.println(v1);
		
		
		Vector v2 = new Vector();
		v2.addElement("Birth");
		
		v2.addAll(v1);
		System.out.println(v2);
		
		v2.removeElement("Year");
		System.out.println(v2);
		
		Enumeration e1 =v2.elements();        //Cursor Topic - Enumeration for Iteration
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
	}

}
