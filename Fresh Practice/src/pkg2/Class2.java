package pkg2;

public class Class2 extends Class1
{
public void method2()
{
	System.out.println("i am class2 method");
}
public Class2() 
{
	super(1,2);
	System.out.println("Child Default Constructor");
}
public Class2(int a)
{
	this(1,2);
	System.out.println("Child 1 Parameterized Constructor");
}
public Class2(int a,int b)
{
	this();
	System.out.println("Child two Parameterized Constructor");
}
public Class2(int a,int b,int c)
{
	this(1);
	System.out.println("Child Three Parameterized Constructor");
}
public static void main(String[] args) 
{
	Class2 obj=new Class2(1,2,3);
	
	
}
}
