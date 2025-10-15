package another_classes_and_methods;

public class SIB_and_IIB_Blocks_02    //Its result is Different
{
	//NOTE : If there are multiple SIB or IIB Blocks then order of Execution will be sequential
	//NOTE : UPON CREATING 1 Object Block, all IIB blocks will be executed.
	//Note : Multiple Objects can also be created.

		static                                         //SIB Block 1st
		{
			System.out.println("Static Block");
		}
		
		 
		{                                               //IIB Block (Depending on Object Creating in Main Method)
			System.out.println("IIB Block");
		}
		
		SIB_and_IIB_Blocks_02()                         //Constructor 
		{
			System.out.println("It is Constructor");
		}
		
		
		
		public static void main(String[] args)
		{
			
			
			new SIB_and_IIB_Blocks_02();    //Object has been created First. So result is different than 1st program
			
			System.out.println("Main Method");

		}

}
