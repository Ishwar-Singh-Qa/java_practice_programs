package collection_framework;

import java.util.HashSet;
import java.util.Set;

public class Set_Inerface_Properties     //Set<I> does not have its own methods
{ 

	public static void main(String[] args) 
	{
		Set s1 = new HashSet();                 //GENERIC EXAMPLE
		
		s1.add(15);             //It is giving the result in Random order
		s1.add(17);
		s1.add("Nov");
		s1.add('M');
		s1.add(16);
		s1.add(16);            //No Duplicay
		s1.add(null);          //Just 1 null
		s1.add(null);
		
		System.out.println("Balle = " + s1);
		
		
		Set<Integer> s2 = new HashSet<> ();     //GENERIC EXAMPLE
		s2.add(12);
		s2.add(10);
		s2.add(11);
	//	s2.add("hey");  //COMPILE TIME ERROR DUE TO STRING

		System.out.println(s2);
		
	}

}


