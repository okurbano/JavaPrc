class IfEx5
{
	public static void main(String ar[])
	{
		int m,p,c;
			
			m=Integer.parseInt(ar[0]);
			p=Integer.parseInt(ar[1]);
			c=Integer.parseInt(ar[2]);

		int total= m+p+c;
		double avg= total/3;
		
		 if(avg>=85) 
		{
			System.out.println("  He got A grade");
			 
		}
		
		
		 else if(m>=35  && p>=35  && c>=35)
			{
					System.out.println("pass");
					if(avg>=70) 
					{
					System.out.println(" He got B grade");
					}	

			}	

			else
				{
				System.out.println("failed");
				}

	

	}
}


// 85 A

// 70 B



