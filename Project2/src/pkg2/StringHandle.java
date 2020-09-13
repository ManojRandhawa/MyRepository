package pkg2;

public class StringHandle
{
	public static void main(String[] args) {
		String m1="My Name is Manoj";
		String[] a =m1.split(" ");
		
		
		
		for(int i=a.length-1;i>=0;i--) 
		{
			System.out.print(a[i] + " ");
		}
		
		
	}

}
