package another_classes_and_methods;

//a) When the value of i reaches 4, the if condition if(i == 4) becomes true, so the continue statement is executed.
//b) When continue is executed, the loop skips the System.out.println(i) statement for that iteration, and control moves to 
//	the next iteration (i.e., i = 5).
	
public class Continue_Java_Keyword {
	public static void main(String[] args) 
	{
		for(int i=1; i<=5; i++)
		{
			
			if(i==4)
			{
				continue;
			}
			
			System.out.println(i);		//It will be skipped once 'continue' will be executed	
		}
	}
}
