package control;

public class BreakEx2 {

	public static void main(String[] args) {

	outer:	for(int i=1;i<=5;i++)   //outer loop
		{
			for(int j=1;j<=5;j++) //inner loop
			{
				if(j==3)
				{
					break outer;
				}
				System.out.println("Inside  J Block");
			}
			System.out.println("Inside I Block");
		}
	System.out.println("Main Block");
	}

}
