package Inheritence;

public class class1 
{
	public class1() {
		this(1,2,3);
		
		System.out.println("Parent default parameterized");
		
	}
	public class1(int a) {
		super();
	
		System.out.println("Parent one parameterized ");
	}
	public class1(int a,int b) {
		this(1);
		System.out.println("parent two parameterized");
		
	}
	public class1(int a,int b,int c) {
		System.out.println("parent three parameterized");
	}
	

}
