package oops;

class Staff2
{
	String company="amazon";
}
class TechnicalStaff extends Staff2{
	String company="amazon prime";
	void print()
	{
		System.out.println(company);   // child class
		System.out.println(super.company);   //parent variable
	}
}
public class EmployeeSuperVariable {

	public static void main(String[] args) {

		TechnicalStaff ts = new TechnicalStaff();
		ts.print();
	}

}
