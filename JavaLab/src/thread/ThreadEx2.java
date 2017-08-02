package thread;

class MyThread3 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(" i = "+i);
		}
	}
}
class MyThread4 extends Thread
{
	public void run()
	{
		for(int j=1;j<=10;j++)
		{
			System.out.println(" j = "+j);
		}
	}
}
class MyThread5 extends Thread
{
	public void run()
	{
		for(int k=100;k<=110;k++)
		{
			System.out.println(" k = "+k);
		}
	}
}
public class ThreadEx2 {

	public static void main(String[] args) {
		MyThread3 t3= new MyThread3();
		MyThread4 t4= new MyThread4();
		MyThread5 t5= new MyThread5();
		t5.start();
		t3.start();
		t4.start();
		

	}

}


