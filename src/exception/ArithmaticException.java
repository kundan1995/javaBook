package exception;

public class ArithmaticException 
{
	public static void main(String args[])
	{
		int a,b;

		try
		{
			a=36;
			b=a/0;
			System.out.print("This will not printed");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division by Zero");
		}
		System.out.println("After catch statement");
	}
}
