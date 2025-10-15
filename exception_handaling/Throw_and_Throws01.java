package exception_handaling;

public class Throw_and_Throws01
{
	
	static void add() throws ArithmeticException   //Every time you throw and exception, you must declare exception  
	{
		throw new ArithmeticException("Enter valid value");
	}

	
	public static void main(String[] args) throws ArithmeticException
	{
		add();
	}

}
//throw : To throw the Exception
//throws: To declare an exception