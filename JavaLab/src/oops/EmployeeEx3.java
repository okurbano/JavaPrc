package oops;
class CitiBank
{
	void firstMethod()  
	{
		System.out.println("First Method Executed");
	}
	void secondMethod()
	{
		System.out.println("Second Method Executed");
	}
	void thirdMethod()
	{
		System.out.println("Third Method Executed");
	}
	CitiBank()  // Constructor
	{
		System.out.println(" Fourth Method");
	}
	
}
public class EmployeeEx3 {

	public static void main(String[] args) {

		CitiBank c1 = new CitiBank();
		c1.firstMethod();
		c1.secondMethod();
		c1.thirdMethod();
	}

}
