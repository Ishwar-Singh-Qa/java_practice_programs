package abstract_and_interface_topics;
//"feature method" has the difference in parameter list, hence it is not getting overridden and both can be called using reference 
class Google
{
	void login()
	{
		System.out.println("Login with email id");
	}
	
	void feature()
	{
		System.out.println("Parent Class's Feature");
	}

}

public class Method_Overriding_Class_02 extends Google
{
	void login()
	{
		System.out.println("Login with Mobile number");
	}
	
	void feature(int a)
	{
		System.out.println("Child Class's Feature");
	}
	
	public static void main(String[] args) 
	{
		Method_Overriding_Class_02 rv = new Method_Overriding_Class_02();
		rv.feature();

	}

}
