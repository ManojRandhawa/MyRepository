package pkg2;

public class asone
{
	public int sum(int a,int b)
	{
		int c = a + b;
		return c;
	}
	public int  sub(int a,int b)
	{
		int c = a - b;
		return c;
	}
	public int mul(int a,int b)
	{
		int c = a * b;
		return c;
	}
	public void div(int a,int b)
	{
		int c = a / b;
		System.out.println("Assignment2 result is "+ c);
		
		
	}
	public static void main(String[] args) 
	{
		asone ref= new asone();
		
		int s1 = ref.sum(10, 2);
		int sum2 = ref.sum(s1, 2);
		int s2 = ref.sub(sum2, 2);
		int m = ref.mul(s2, 2);
		ref.div(m, 2);	
		
	}
}
