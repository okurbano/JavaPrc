package array;
//Passing arrays to method
public class ArrayEx4 {

	public static void main(String[] args) {
		Integer ar[]={10,20,30,40,50,60,40};
			Employee e1 = new Employee();
			e1.printEmpId(ar);  //actual para  

	}

}

class Employee
{
	void printEmpId(Integer[] arrr)      
	{
		for (int x : arrr)
		{
			System.out.println(x);
		}
	
	}
}
