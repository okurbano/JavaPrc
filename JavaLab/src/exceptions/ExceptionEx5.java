package exceptions;

public class ExceptionEx5 {

	public static void main(String[] args) {
try{
      int age=Integer.parseInt(args[0]);
      
      if(age<=18)
    	  throw new Exception(" Age cannot be less than 18 ");
      System.out.println("My age = "+age);
}
catch(Exception e)
{
	System.out.println(e);
}
      
}

}




