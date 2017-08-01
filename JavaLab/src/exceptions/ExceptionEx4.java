package exceptions;
// nested try block
public class ExceptionEx4 {

	public static void main(String[] args) {
		try
		{
			
		int a =Integer.parseInt(args[0]);
				try{
						System.out.println("Divide by zero");
						int num =100/a;
						System.out.println("number = "+num);
					}
		
					catch(ArithmeticException ae)
					{
						System.out.println(ae);
					}
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
