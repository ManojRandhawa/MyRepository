package pkg2;

public class Class5 extends Class4
{
	
	
	public void sum(int a,int b)
	{
		 int c=a-b;
		 System.out.println(c);
	}
	
	public void sum(int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println(d);
	}
	
	
	public static void main(String[] args) 
	{
		Class5 obj=new Class5();
		obj.sum(10, 8);
		
		
		
		
		
	}

}
