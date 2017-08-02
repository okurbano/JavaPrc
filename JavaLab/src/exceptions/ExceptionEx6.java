package exceptions;
//throws 

class Employee
{
	void getEmployee(int a, int b)  throws Exception
	{
		int c=a/b;
		System.out.println(" c = "+c);
	}
}
public class ExceptionEx6 {

	public static void main(String[] args) throws Exception {
		Employee e1 = new Employee();
		try{
			e1.getEmployee(10,0);   //actual	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
