class NestedEx5
{
	public static void main(String[] ar) 
	{
		int num;
		num=145;
		int temp= 145;

		
		int sum=0;

	while(num>0)
		{
	   int r=num%10;
	   int fact=1;
	   for(int i=1;i<=r;i++)
		{
		   fact=fact*i;
		}

		sum=sum+fact;
		num =num/10;	

	}
	if(sum==temp)
		{
		System.out.println(" Strong");
		}
		else
		{
			System.out.println(" Not strong");
		}
	}
}

