package abstract_and_interface_topics;

class Calculator
{
	void multiply()
	{
		System.out.println("Parent Class multiply method");
	}
}


public class Super_Keyword_Class extends Calculator
{
	void multiply()            //method will be executed line by line
	{
		super.multiply();        //super keyword can be used multiple times      
		System.out.println("Child Class multiply method");
		super.multiply();       
	}
	
	public static void main(String[] args) 
	{
		Super_Keyword_Class rv = new Super_Keyword_Class();
		rv.multiply();

	}

}
