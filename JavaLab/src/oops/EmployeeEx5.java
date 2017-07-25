package oops;

class Staff3{
	Staff3()  //constructor
	{
		System.out.println(" Parent class Staff Method");
	}
	
}
class TeacherStaff3 extends Staff3{
	TeacherStaff3()  //constructor
	{
		System.out.println(" Child class Teachers Staff");
	}
}

public class EmployeeEx5 {

	public static void main(String[] args) {
		TeacherStaff3 ts = new TeacherStaff3();

	}

}
