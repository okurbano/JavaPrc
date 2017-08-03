package thread;

public class MyThreadEx1 {

	public static void main(String[] args) {
		
		Thread t = new Thread();
	MyChild1 mc = new MyChild1();
	mc.start();
	int count=Thread.activeCount();
	System.out.println(" Number of Threads Running  = "+count);	
	
	
	t.setName("Parent");
	mc.setName("child");
	System.out.println("first Thread = "+t.getName());
	System.out.println("Second Thread = "+mc.getName());
	
	

	}

}
class MyChild1 extends Thread
{
	public void run()
	{
		System.out.println(" I am a child Thread");
	}
}
