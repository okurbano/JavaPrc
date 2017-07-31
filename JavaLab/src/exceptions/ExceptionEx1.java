package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx1 {

	public static void main(String[] args) {
		
		int a,b;
		System.out.println(" Enter two numbers" );
		try
		{
			Scanner sc= new Scanner(System.in);
			a = sc.nextInt();
			b=sc.nextInt();
		int c=a/b;
		System.out.println("  C value = "+c);
		}
		catch(ArithmeticException ar)
		{
			System.out.println(ar.getMessage());
		}
		catch(InputMismatchException ime)
		{
			System.out.println(" Cannot Divide with letter");
		}
		
		
		
		
	}

}
