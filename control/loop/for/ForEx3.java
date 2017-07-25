class ForEx3
{
	public static void main(String ar[])
	{
		int num,count=0;
		num=Integer.parseInt(ar[0]);
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;     // 1,2
			}
		}
		if(count<=2)
			{
			System.out.println(" prime");
			}
			else
		{
				System.out.println(" not prime Number");
		}
		
		
	}
}