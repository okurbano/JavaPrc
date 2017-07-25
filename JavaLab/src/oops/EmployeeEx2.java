package oops;

class CapitalOne {
	
	int eid;
	String ename;
	double sal;   // fields
	
	void setDetails(int x, String y, double z)  // Formal Parameters
	{
		this.eid=x;
		this.ename=y;
		this.sal=z;
		
	}
	void setDetails(int a , String b)  // Formal Parameters
	{
		this.eid=a;
		this.ename=b;
	}
	
	void getDetails()
	{
		System.out.println(" Eid = "+eid);
		System.out.println("Employee name = "+ename);
		System.out.println("Employee salary = "+sal);
	}
	
	
}
public class EmployeeEx2
{
	public static void main(String ar[])
	{
		CapitalOne e1 = new CapitalOne();	
		
		e1.setDetails(101,"anusha");  //Actual Parameters
		e1.getDetails();
		
		
	}
}

