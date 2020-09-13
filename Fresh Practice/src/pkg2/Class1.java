package pkg2;

public class Class1 
{
	public void method1()
	{
		System.out.println("i am class 1 method");
	}
	public Class1() 
	{
		this(1,2,3);
		System.out.println("Parent Default Constructor");
	}
	public Class1(int a)
	{
		this();
		System.out.println("Parent One parameterized Constructor");
		
	}
	public Class1(int a,int b)
	{
		this(1);
		System.out.println("Parent Two Parameterized Constructor");
	}
	public Class1(int a,int b,int c)
	{
		System.out.println("Parent Three Parameterized Constructor");
	}
	public static void main(String[] args) 
	{
		
	}

}
