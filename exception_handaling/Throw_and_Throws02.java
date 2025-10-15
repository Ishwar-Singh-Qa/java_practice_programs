package exception_handaling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Throw_and_Throws02   //Here we are using 2 throws as comma separated
{

	public static void main(String[] args) throws InputMismatchException,ArithmeticException
	{
		Scanner s1 = new Scanner(System.in);
		int input = s1.nextInt();
		
		if (input>25)       //Only give in Numbers.becoz if text likha to uske liye try/catch use krna pdega
		{
			throw new InputMismatchException("If Block Working");
		}
		
		else
		{
			throw new ArithmeticException("Else Block Working");
		}

	}

}
