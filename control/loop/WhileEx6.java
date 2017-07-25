class WhileEx6
{
	public static void main(String ar[])
	{
		int  min=1;
		int max=5;
		int sum=0;


		while(min<=max)
		{
			sum= sum+min;
			min = min +1;
		}
		
		System.out.println(" Summation = " + sum);
	}
}

//  program to print summation of min to max 