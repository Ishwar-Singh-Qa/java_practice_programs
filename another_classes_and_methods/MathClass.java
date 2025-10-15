package another_classes_and_methods;

public class MathClass 
{

	public static void main(String[] args) //Hover over 'Math' class or its method cntrl+Click -> to open Math Class
	{
		
		System.out.println("AddExact = " + Math.addExact(7, 21));
		
		long multiply = Math.multiplyExact(7, 9);
		System.out.println("multiplyExact = " + multiply);
		
		System.out.println("subtractExact = " + Math.subtractExact(50, 15));
		
		double maxNum = Math.max(111.5, 111.4);
		System.out.println("maxNum = " + maxNum);
		
		System.out.println("Absolute Num = " + Math.abs(-13)); //absolute method coverts negative num to positive number
		
		double randomNum = Math.random();   //It gives the number between 0 to 1
		System.out.println("Random Number b/w 0 to 1 = "+ randomNum);
		
	}
}
