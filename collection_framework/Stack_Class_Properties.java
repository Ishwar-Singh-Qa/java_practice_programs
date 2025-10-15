package collection_framework;

import java.util.Collections;
import java.util.Stack;

public class Stack_Class_Properties {

	public static void main(String[] args) 
	{
		Stack s = new Stack ();
		
		s.push("Jai");
		s.push("Shri");
		s.push("Ram");
		System.out.println(s);   //Print collection after Pushing/Adding Elements
		
		Object nn = s.pop();     //pop() is used to remove
		System.out.println(nn);  //Print popped element and Can be written in one line also
		
		System.out.println(s);  //Print collection after using pop()
		
		System.out.println(s.peek()); //Just to display the top most element
		
		s.push("Armaan");
		Collections.sort(s);    //Result can be sorted using Collection class's sort()
		System.out.println(s);
	}

}
