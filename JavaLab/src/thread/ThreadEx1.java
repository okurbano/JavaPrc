package thread;

class MyThread1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(" i = "+i);
		}
	}
}
class MyThread2 extends Thread
{
	public void run()
	{
		for(int j=1;j<=10;j++)
		{
			System.out.println(" j = "+j);
		}
	}
}
public class ThreadEx1 {

	public static void main(String[] args) {
		MyThread1 t1= new MyThread1();
		MyThread1 t2= new MyThread1();
		t1.start();
		t2.start();
		

	}

}


