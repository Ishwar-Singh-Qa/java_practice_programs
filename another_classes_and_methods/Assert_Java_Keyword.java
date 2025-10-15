package another_classes_and_methods;

public class Assert_Java_Keyword 
{

	public static void main(String[] args) //PURPOSE IS TO GET THE ERROR IF CONDITION IS FAILING
	{
		int age = 17;
		
		assert age >=18 : "Checking the age";  //We have to enable assert keyword first
		
		
		System.out.println("Age = "+ age);

	}

}
