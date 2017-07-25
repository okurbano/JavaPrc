class WhileEx7
{
	public static void main(String ar[])
	{
		int  min=1;  //1
		int max=5;
		int fact=1;


		while(min<=max)  //2
		{
			fact *= min;//3

			min=min+1;//4
		}
		System.out.println(" Factorial = "+fact);
	}
}

