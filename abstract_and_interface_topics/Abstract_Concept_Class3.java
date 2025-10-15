package abstract_and_interface_topics;

abstract class Class1
{
	abstract void method1();   //semi column at the end of abstract method
	abstract int method2();
	
	void info()               //It is optional to be overridden
	{
		System.out.println("It is the Grand Parent Class");
	}
	
//	public static void main(String[] args) //Abstract or Interface can not be instantiated
//	{
//	}
}


abstract class Class2 extends Class1
{
	abstract void method3();
	abstract String method4();
	
	Class2()   //abstract class can have constructor also. And it will be called as we create obj of its Child class.
	{
		System.out.println("Class_2 abstract class constructor");
	}
	
	
}



public class Abstract_Concept_Class3 extends Class2       //It is a concrete Class
{

	public static void main(String[] args) 
	{		
		Abstract_Concept_Class3 childObj = new Abstract_Concept_Class3();
		childObj.method1();
		childObj.method2();
		childObj.method3();
		childObj.method4();

	}

	@Override
	void method3() 
	{
		System.out.println("My name is Method 3");
	}

	@Override
	String method4() 
	{
		System.out.println("My name is Method 3");
		return "Ishu";
	}

	@Override
	void method1() 
	{
		System.out.println("My name is Method 1");
		
	}

	@Override
	int method2() 
	{
		System.out.println("My name is Method 2");
		return 16;
	}

}
