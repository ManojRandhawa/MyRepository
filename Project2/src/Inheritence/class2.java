package Inheritence;

public class class2 extends class1{

public class2()
{
	super(1,2);
	System.out.println("child default parameterized");
	
}
public class2(int a) {
	this(2,23);
	System.out.println("child one parameterized");
}
public class2(int a,int b) {
	super(1);
	System.out.println("child two parameterized");
}
public class2(int a,int b,int c) {
	this(1);
	System.out.println("child three parameterized");
	
}
public static void main(String[] args)
{
	class2 obj= new class2(2,2);
}
}