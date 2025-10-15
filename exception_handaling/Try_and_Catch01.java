package exception_handaling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_and_Catch01 {
	
	void method01()
	{
		try
		{
			Scanner s1 = new Scanner(System.in);
			int size = s1.nextInt();                 //This exception is handled by catch block
			int []rollno = new int[size];          
		}
		
		catch (InputMismatchException e1)
		{
			System.out.println("Only positive numbers are allowed to input");
		}
	}
	

	public static void main(String[] args) 
	{
		Try_and_Catch01 obj = new Try_and_Catch01();
		obj.method01();
	}

}
