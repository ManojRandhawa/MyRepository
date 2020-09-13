package Pkg1;

public class Math2 
{
	public int sum(int a,int b)
	{
		int c=a+b;
		System.out.println("Sum is "+c);
		return c;
	}
	
	public int sub(int a,int b)
	{
		int c=a-b;
		System.out.println("Subtraction is "+c);
		return c;
	}
	public int mul(int a,int b)
	{
		int c=a*b;
		System.out.println("Multiply is "+c);
		return c;
	}
	public void div(int a,int b)
	{
		int c=a/b;
		System.out.println("Result is "+c);
	}
	public static void main(String[] args) 
	{
		Math2 obj1=new Math2();
		int sumresult=obj1.sum(10, 2);
		int subresult=obj1.sub(sumresult, 2);
		int sumresult2=obj1.sum(subresult, 2);
		int mulresult=obj1.mul(sumresult2, 2);
		obj1.div(mulresult, 2);
	}

}









