class Employee 
{
	int  eid,sal;
	String name;
	static String coname;
	
}

public class VarEx3
{
	public static void main(String ar[])
	{
	Employee e1= new Employee();
	e1.eid=101;
	e1.sal=2000;
	e1.name="Naresh";
	Employee.coname="Toyota";

	Employee e2= new Employee();
	e2.eid=102;
	e2.sal=4000;
	e2.name="Suresh";
	

	Employee e3= new Employee();
	e3.eid=103;
	e3.sal=6000;
	e3.name="mahesh";
	
	System.out.println(e1.name);
	System.out.println(e3.name);
	System.out.println(e2.name);
	System.out.println(e2.name+"working in "+Employee.coname);
	
	
	}
}
