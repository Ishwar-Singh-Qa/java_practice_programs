package collection_framework;

import java.util.ArrayList;

public class ForEach_with_ArrayList  //For each Loop can be used in entire Collection(List,Set,Queue)
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<> ();
		
		al.add(21);    //Now ArrayList is coming from ArrayList class
		al.add(22);
		al.add(2,23);
		System.out.println(al);
		
		
		//USING FOR EACH LOOP FOR ITERATION (Can be used instead of Iterator)
		
		for(Integer num : al)
		{
			System.out.println(num);
		}
		

	}

}
