package inheritance;


class Basic
{
	int a,b;
	int add,sub;
	 void setData(int x, int y)
	 {
		 this.a=x;
		 this.b=y;
		 
	 }
	 void calc()
	 {
		 add=a+b;
		 sub=a-b;
	 }
	 void getData()
	 {
		 System.out.println(" Addition  = "+add);
		 System.out.println(" Subtraction  = "+sub);
	 }
	
}
class Arithmetic extends Basic
{
	int mul,div;
	
	void advance()
	{
		mul=a*b;
		div=a/b;
	}
	void getData()
	{
		System.out.println(" Addition  = "+add);
		 System.out.println(" Subtraction  = "+sub);
		System.out.println("Multiplication  = "+mul);
		System.out.println("Division = "+div);
		
	}
}
public class Calculator {

	public static void main(String[] args) {
		Arithmetic a1 = new Arithmetic();
		a1.setData(20,15);
		a1.calc();
		a1.advance();
		a1.getData();
		
		
	}

}
