package abstract_and_interface_topics;
//Here methods are non-para


class Facebook
{
	void login()
	{
		System.out.println("Login with email id");
	}

}



public class Method_Overriding_Class extends Facebook
{
	void login()
	{
		System.out.println("Login with Mobile number");
	}

	public static void main(String[] args) 
	{
		Method_Overriding_Class rv = new Method_Overriding_Class();//Created Child class's object to call Child/Parent methods
		
		rv.login();   //Chiuld class method is being called since it has overrideen parent class method

	}

}
