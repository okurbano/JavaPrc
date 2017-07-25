class ForEx1
{
	public static void main(String ar[])
	{
		int  min;
		int max=5;
		int fact=1;
		for(min=1; min<=max; min++)
		{
			fact=fact*min;
		}
		System.out.println("factorial = "+fact);
	}
}