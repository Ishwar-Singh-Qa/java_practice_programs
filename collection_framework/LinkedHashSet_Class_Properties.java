package collection_framework;

import java.util.LinkedHashSet;

public class LinkedHashSet_Class_Properties 
{

	public static void main(String[] args) 
	{
		LinkedHashSet lhs = new LinkedHashSet();
		
		lhs.add(null);
		lhs.add(31);
		lhs.add(34);
		lhs.add(32);
		lhs.add(null);
		lhs.add(33);
		lhs.add(33);
		
		System.out.println(lhs);

	}

}
