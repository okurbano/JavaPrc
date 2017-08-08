package collections;

public class Employee {

	public static void main(String[] args) {
		Student s = new Student();
		String name=s.add("ravi");
		System.out.println("Total  = "+name);

	}

}
class Student
{
	public <E> add(String  x)
	
	{
		String name ="kumar";
		return name+x;
	}
}
