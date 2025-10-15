package abstract_and_interface_topics;

interface One
{
	int x =10;                      //Global variables are public+static+final in nature by default
	void method1();
}

interface Two
{
	void method2();
}


public class Interface_Diamond_Solution implements One,Two    //it is is CLASS, inheriting 2 interfaces

{
	//x=11;          //Getting error since global var 'x' is public+static+final in nature
	public static void main(String[] args) 
	{
		Interface_Diamond_Solution rf = new Interface_Diamond_Solution();
		System.out.println(rf.x);
	}
	
	
	public void method1()
	{
		System.out.println("Its method1");
	}
	
	public void method2()
	{
		System.out.println("Its method2");
	}
	
	
}
