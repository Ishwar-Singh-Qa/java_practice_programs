package calling_statements;

class Class001      //PARENT CLASS OF ANOTHER 2 CLASSES IN THE PROGRAM
{
	Class001()
	{
		System.out.println("Class001 Constructor");   //IT is Getting called from Implicit super() from its Child Class
	}
}

class Class002 extends Class001
{
	Class002()
	{
		System.out.println("Class001 Constructor");
	}
	public static void main(String[] args) 
	{
		new Super_Calling_Hierarchical_Class003();

	}
}


public class Super_Calling_Hierarchical_Class003 extends Class001
{

	public static void main(String[] args) 
	{
		new Super_Calling_Hierarchical_Class003();

	}

}
