package thread;
//join method
public class MyThreadEx4 {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		a.start();
		try {
			a.join();
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		b.start();
		c.start();

	}

}
class A extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			if(i==2)
			{
			System.out.println(" i = "+i);
		}
	}
}
class B extends Thread
{

	public void run()
	{
		for(int j=0;j<=5;j++)
		{
			System.out.println(" j = "+j);
		}
	}
	
}
class C extends Thread
{
	public void run()
	{
		for(int k=0;k<=5;k++)
		{
			System.out.println(" k = "+k);
		}
	}
	
}