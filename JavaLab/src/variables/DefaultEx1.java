package variables;

public class DefaultEx1 {

	public static void main(String[] args) {
		Example x = new Example();
		x.values(10);
		x.print();

}

}

class Example{
	int num;
	int second;
	void values(int x)
	{
		this.num=x; 
	}
	void print()
	{
		System.out.println("number = "+ num);
		System.out.println("Second number = "+second);
		
	}
}
