package collection_framework;
import java.util.*;            //IMPORT ALL CLASSES OF UTIL PACKAGE

//listIterator()
public class List_Interface_Methods 
{
	public static void main(String[] args) 
	{
		 List<Integer> li =new ArrayList<> (2); //is an initial capacity specification. 
		                                        // This means that the ArrayList is created with an initial capacity to hold 4 elements before it needs to resize.

		 li.add(15);      //add() is coming from LIst<I> instead of Collection<I> due to overriding
		 li.add(1, 12);  //Can also be added using index position (method present in List<I>)
		 li.add(2, 13);
		 li.add(14);
//		 li.add("Ishu");      //Compiler error since it is a GENERIC type of <Interface>
		 System.out.println(li);
		 
		 Collections.sort(li);       //SORTING(Ascending) THE LIST using Collections CLASS's "sort" method
		 System.out.println(li);
		 

		 
		 ListIterator litr=li.listIterator();
		 
		 System.out.println("Forward Direction"); //Mandatory to do, in order to do Backward Direction
		 while(litr.hasNext())
		 {
			 System.out.println(litr.next());
		 }
		 

		 
		 System.out.println("Backward Direction"); 
		 while(litr.hasPrevious())
		 {
			 Object i =litr.previous();
			 System.out.println(i);
			 
		//	 System.out.println(litr.previous());   //Alternate of above 2 lines
		 }
	

	}

}
