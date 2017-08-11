package swings;

public class Test {

	public static void main(String[] args) {
Employee e1 = new Employee();
e1.read();
	}

}
class Employee
{
	void print()
	{
		System.out.println("print");
	}
	void read()
	{
		System.out.println("read");
		print();
	}
}
