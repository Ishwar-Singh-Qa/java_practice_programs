package collection_framework;

import java.util.ArrayList;

public class ArrayList_Class_Properties
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<> ();
		
		al.add(60);
		al.add(50);    //Collection<I> method
		al.add(51);    //NOTE ------------------->index 2 ki value update ho gyi h..so ye shift ho kr last me aa gya
		al.add(2,52);  //List<I> method
		al.add(3,53);
		al.add(3,53);
		al.add(null);
		al.add(null);
		
		System.out.println(al);     //Follows order of insertion, duplicate null and values
		
		System.out.println("Get index 2 value = " + al.get(2));
		
		al.set(2, 55);                //set() used to modify the result
		
		System.out.println("After setting index 2 new value = " + al.get(2));
		
		ArrayList al2= new ArrayList<> ();    //This diamond opeartor shows it is Non-Generic
		al2.add(52);
		al2.add(53);
		al2.add(51);
		
		al2.remove(0);
		System.out.println(al2);
		
		al2.removeAll(al);          //al2 me se vo elemets remove kro jo al me bhi common hain.    
		System.out.println(al2);
	}
}
