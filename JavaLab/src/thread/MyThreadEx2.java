package thread;
// sleep
public class MyThreadEx2 {

	public static void main(String[] args) {
		
			for( int i=1;i<=10;i++)
			{
				System.out.println(i);
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
	//		System.out.println(" no of threads running = "+Thread.activeCount());
	}

}
