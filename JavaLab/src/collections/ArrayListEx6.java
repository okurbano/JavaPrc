package collections;

import java.util.ArrayList;

class Employee1
{
	int id;
	String name;
	String role;
	void setDetails(int x, String y, String z)
	{
	this.id=x;
	this.name=y;
	this.role=z;
	}
	
	void getDetails()
	{
		System.out.println(" Id = "+id);
		System.out.println(" Name = "+name);
		System.out.println(" role = "+role);
	}
}
public class ArrayListEx6 {

	public static void main(String[] args) {

		Employee1 e1= new Employee1();
		Employee1 e2= new Employee1();
		Employee1 e3= new Employee1();
		Employee1 e4= new Employee1();
		e1.setDetails(101,"anitha","manager");
		e2.setDetails(102,"sunitha","developer");
		e3.setDetails(103,"kavitha","lead");
		e4.setDetails(104,"rajitha","BA");
		
		ArrayList<Employee1> al = new ArrayList<Employee1>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		
		for(Employee1 e : al)
		{
			System.out.println(e.id + "  "+e.name+ " "+e.role);
		}
		
		
	}

}
