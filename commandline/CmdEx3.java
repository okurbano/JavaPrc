class CmdEx3
{
	public static void main(String ar[]) 
	{	
		String name="ravi";
		String add=name+ar[0];
		System.out.println("   Total String = " +add);
		int m,p,c;
		m=Integer.parseInt(ar[0]);
		p=Integer.parseInt(ar[1]);
		c=Integer.parseInt(ar[2]);
		int tot=m+p+c;
		System.out.println(" total = " + tot);
	}
}
