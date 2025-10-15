package exception_handaling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_and_Catch02 
{

	public static void main(String[] args) //Single try with multiple catch blocks
	{
		
		try
		{
		System.out.println("Enter 2 numbers");
		Scanner s1 = new Scanner(System.in);
		int a =  s1.nextInt();
		int b = s1.nextInt();
		int div=a/b;
		System.out.println("Division answer is = " + div);
		}
		
		catch(InputMismatchException e1)                    //when user enters text instead of number
		{
			System.out.println("1st catch - Again enter 2 Numbers ONLY");
			Scanner s1 = new Scanner(System.in);
			int a =  s1.nextInt();
			int b = s1.nextInt();
			int div=a/b;
			System.out.println("Division answer is = " + div);
		}
		
		catch(ArithmeticException e2)                        //when user enters 2nd value as 0
		{
			System.out.println("2nd catch - Again enter 2 Non-Zero Numbers ONLY");
			Scanner s1 = new Scanner(System.in);
			int a =  s1.nextInt();
			int b = s1.nextInt();
			int div=a/b;
			System.out.println("Division answer is = " + div);
		}
		
	}

}
