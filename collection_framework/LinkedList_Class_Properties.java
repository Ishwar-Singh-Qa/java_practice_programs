package collection_framework;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList_Class_Properties  //common class of List<I> and Queue<I>
{

	public static void main(String[] args) 
	{
		LinkedList<Integer> ll = new LinkedList<> ();
		
		ll.add(60);
		ll.add(50);
		ll.add(51);    //Collection<I> method
		ll.add(2,52);  //List<I> method
		ll.add(3,53);
		ll.add(3,53);
		ll.add(3,53);
		ll.add(null);
		ll.add(null);
		
		System.out.println(ll);     //Follows order of insertion, duplicate null and values
		
		System.out.println(ll.get(2));   //Print 2nd index->52
		
		ll.set(2, 55);                   //set() used to modify the result (Updating index 52)
		
		System.out.println(ll.get(2));   //Print 2nd index->55
		
	}

}
