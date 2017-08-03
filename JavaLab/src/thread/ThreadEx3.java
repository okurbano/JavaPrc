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
// If we are not extending Thread class , our Implementation class cannot be threated as thread obj.
// we externally create thread class object and we pass that object to implementation class obj so that we can execute run method.