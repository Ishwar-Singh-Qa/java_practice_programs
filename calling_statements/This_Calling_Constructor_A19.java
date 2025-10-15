package calling_statements;

public class This_Calling_Constructor_A19
{
	
	This_Calling_Constructor_A19()
	{
		this(16,"Gulati");        //this calling statement should also be written explicitly
		System.out.println("Non-Parameterized");
	}
	
	This_Calling_Constructor_A19(int a)
	{

		System.out.println("1 Int Parameter");
	}
	
	This_Calling_Constructor_A19(int a,String b)
	{
		this(29);
		System.out.println("2 Int & String Parameters");
		System.out.println("Printing parameter values - " + a + b);
	}
	
	
	public static void main(String[] args) 
	{
		new This_Calling_Constructor_A19();

	}

}
