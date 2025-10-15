package calling_statements;
//super() is used to call the Parent class Constructors
//super() is the first line in every constructor implicitly

class class11
{
	class11()
	{                                              //implicit super()
		System.out.println("class1 constructor");
	}
}

class class22 extends class11
{
	class22()
	{                                             //implicit super() - it called class 1 constructor
		System.out.println("class2 constructor");
	}
}

public class Super_Calling_Implicitly_Class33_A17 extends class22
{
	Super_Calling_Implicitly_Class33_A17()
	{                                             //implicit super() - it called class 2 constructor
		System.out.println("class3 constructor");
	}

	
	public static void main(String[] args) 
	{
		new Super_Calling_Implicitly_Class33_A17();   //Just making object each class Constructors have got called
		

	}

}
