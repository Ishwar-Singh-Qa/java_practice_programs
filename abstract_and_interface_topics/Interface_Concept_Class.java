package abstract_and_interface_topics;

interface Amazon   //Since it is interface hence no need to write "class" keyword
{
	void login();        //By default all abstract methods in interface are public & abstract.
	void registration(); //We can not any Access Specifier other than public.
	

}



public class Interface_Concept_Class implements Amazon
{
	public void login()        //While overriding, it is mandatory to write public
	{
		System.out.println("Login method");
	}


	public void registration() //While overriding, it is mandatory to write public
	{
		System.out.println("Registration method");
		
	}
	
	public static void main(String[] args) 
	{
		Interface_Concept_Class obj = new Interface_Concept_Class();
		obj.login(); 
		obj.registration();
	}
}
