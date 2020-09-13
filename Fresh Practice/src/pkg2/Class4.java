package pkg2;

public class Class4 
{
	
	public void m2()
	{
		System.out.println("i am Parent Default Method");
	}
	public void m3(int a)
	{
		this.m2();
		System.out.println("i am one parameterized method");
	}
	public void sum(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}

}
