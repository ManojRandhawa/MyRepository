package Pkg1;

public class cons 
{
	public void m1()
	{
		this.m3();
		System.out.println("I am method 1");
	}
	public void m2()
	{
		
		
		this.m4();
		System.out.println("I am method 2");
	}
	public void m3()
	{
		System.out.println("I am method 3");
	}
	public void m4()
	{
		this.m1();
		System.out.println("I am method 4");
	}
	public static void main(String[] args) 
	{
		cons obj=new cons();
		obj.m2();
		
	}

}
