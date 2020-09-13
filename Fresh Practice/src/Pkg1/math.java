package Pkg1;

public class math 
{
	public int sum(int a,int b) 
	{
		int c=a+b;
		System.out.println("result of sum is "+c);
		return c;
		
	}
	public int sub(int a,int b) 
	{
		int c=a-b;
		System.out.println("result of sub is "+c);
		return c;		
	}
	public void mul(int a,int b) 
	{
		int c=a*b;
		System.out.println("result is "+c);
	}
	public static void main(String[] args) 
	{
		math obj=new math();
		int sum_result=obj.sum(4, 5);
		int sub_result=obj.sub(6, 2);
		obj.mul(sum_result, sub_result);
		
		
	}

}
