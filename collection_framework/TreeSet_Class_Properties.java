package collection_framework;

import java.util.TreeSet;

public class TreeSet_Class_Properties 
{

	public static void main(String[] args) 
	{
		TreeSet ts = new TreeSet ();
		
		ts.add(43);
		ts.add(41);
		ts.add(42);
//		ts.add(null);              //EXCEPTION - TreeSet Class does not support even any single null
		ts.add(39);
		ts.add(44);
		ts.add(40);
//		ts.add("Ishaan");         //EXCEPTION - As TreeSet does not support any null value
		 
		System.out.println(ts);  //Order of Insertion : According to their natural ascending ordering
		
		
		

	}

}
