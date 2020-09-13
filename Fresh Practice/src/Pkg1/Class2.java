package Pkg1;

public class Class2
{
	public Class2() 
	{
		this(1,2,3);
		System.out.println("I am Default Constructor");
	}
	public Class2(int a)
	{
		this(1,2);
		System.out.println("I am One Parameterized Constructor");
		
	}
	public Class2(int a,int b)
	{
		this();
		System.out.println("I am Two Parameterized Constructor");
	}
	public Class2(int a,int b,int c)
	{
		
		System.out.println("I am Three Parameterized Constructor");
	}
	public static void main(String[] args) 
	{
		Class2 obj=new Class2(22);
		
	}
}
