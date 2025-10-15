package abstract_and_interface_topics;

interface A
{
	void apple();
	
	default void add()
	{
		
	}
}

interface B extends A
{
	void banana();
}


public class Interface_Extends_Class implements B
{

	public static void main(String[] args) 
	{
		

	}

	@Override
	public void apple() 
	{

		
	}

	@Override
	public void banana() 
	{

		
	}

}
