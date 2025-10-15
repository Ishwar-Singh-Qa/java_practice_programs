package another_classes_and_methods;    //Area of Circle using Math.PI and Scanner Class
import java.util.*;

public class Area_Of_Circle_Math_A12           //pi*radius*radius
{

	public static void main(String[] args) 
	{
		double piValue = Math.PI;
		System.out.println("PI Value = "+ piValue);
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter the value of radius");
		double radius = s1.nextDouble();
		
		double Area_Of_Circle = piValue*radius*radius;
		
		System.out.println("Area_Of_Circle will be = "+ Area_Of_Circle);		
	}
}
