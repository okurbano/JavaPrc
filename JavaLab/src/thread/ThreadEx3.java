package thread;
//implementing runnable interface
class MyThread6 implements Runnable
{
	public void run()
	{
		System.out.println(" sixth Thread Hello Thread is running");
		
	}
}
public class ThreadEx3 {

	public static void main(String[] args) {
		MyThread6 t6 = new MyThread6();
		Thread t = new Thread(t6);
		t.start();

	}

}
