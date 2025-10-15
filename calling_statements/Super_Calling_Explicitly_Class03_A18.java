package calling_statements;


class Class01
{
	Class01(int a, String b)          //Constructor of Class01
	{
		System.out.println("Class01 Constructor =" + a +" " +b);
	}
}

class Class02 extends Class01
{
	Class02(int i)
	{
		super(5,"Singh");
		System.out.println("Class02 Constructor");
		
	}
}

public class Super_Calling_Explicitly_Class03_A18 extends Class02
{
	Super_Calling_Explicitly_Class03_A18()
	{
		super(99);
		System.out.println("Super_Calling_Explicitly_Class03 - Constructor");
	}

	public static void main(String[] args) 
	{
		new Super_Calling_Explicitly_Class03_A18();

	}

}
