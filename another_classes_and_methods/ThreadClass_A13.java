package another_classes_and_methods;

public class ThreadClass_A13  //It makes the program sleep for sometime
{

	public static void main(String[] args) throws InterruptedException//By writing Thread.sleep it's suggestion will come
	{
		int i;
		
		for(i=1; i<=10; i++)
		{
			System.out.println(Math.random());
			Thread.sleep(1000);
		}

	}

}
