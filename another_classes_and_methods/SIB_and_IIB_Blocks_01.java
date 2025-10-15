package another_classes_and_methods;

public class SIB_and_IIB_Blocks_01
//NOTE : If there are multiple SIB or IIB Blocks then order of Execution will be sequential

{
	static                                             //SIB Block
	{
		System.out.println("Static Block");
	}
	
	{                                                  //IIB Block (Depending on Object Creating in Main Method)
		System.out.println("IIB Block");
	}
	
	SIB_and_IIB_Blocks_01()                             //Constructor 
	{
		System.out.println("It is Constructor");
	}
	
	
	
	public static void main(String[] args)
	{
		System.out.println("Main Method");
		
		new SIB_and_IIB_Blocks_01();             //Object has been created
		
	}

}
