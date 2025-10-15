package exception_handaling;

public class Try_Catch_Finally03    //finally block always get executed, try-finally can also be written.
{

	public static void main(String[] args) 
	{
		try
		{
			int c = 1/0;
		}
		
		catch(RuntimeException e)   //Not Recommended to use.ArithmeticException is recommended.
		{
			System.out.println("Catch block executed with Root class of RuntimeException");
		}
		
		finally
		{
			System.out.println("finally block will execute for sure");
		}
		

	}

}
