import java.util.Scanner;

public class FibMain
{ 
	public static int c;
	public static void main(String[] args) 
	{ 
		
		System.out.println("Enter The Number Cap: ");
		Scanner s = new Scanner(System.in); 
		int max = s.nextInt(); 
		
				
		fib(0, 1,max);
		System.out.println();
		System.out.println("its done");
	
		
		
		 
	}
	public static void fib(int a , int b, int max) 
	{
		System.out.print(a +", ");
		c = b+a; 
		a = b; 
		b = c ; 
		if(a<max)
		{
			fib(a, b, max); 
		}
		
		
	}
	
	
}
