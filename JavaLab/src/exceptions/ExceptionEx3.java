package exceptions;

public class ExceptionEx3 {

	public static void main(String[] args) {
			
			try{
				int a=Integer.parseInt(args[0]);
				int b=Integer.parseInt(args[1]);
				int c;
				 c=a/b;	
				 System.out.println(" C value= "+c);
			}
			
			catch(ArithmeticException ae)
			{
				System.out.println(ae);
			}
			catch(ArrayIndexOutOfBoundsException aie)
			{
				System.out.println(aie);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			finally
			{
				System.out.println("finally executed");
			}
			
			System.out.println(" APplication Completed");
			
			
	}

}
