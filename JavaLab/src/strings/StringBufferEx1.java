package strings;

public class StringBufferEx1 {

	public static void main(String[] args) {
		Student s1 = new Student(101);
		String s2= new String("raju");
		System.out.println(s1);
		System.out.println(s2);
	}

}

class Student
{
	int id;
	Student(int s)
	{
		this.id=s;
	}
	public String toString()
	{
		return id+ " ";
	}
	
	
}
