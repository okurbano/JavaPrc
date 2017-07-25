class SwitchEx1
{
	public static void main(String ar[])
	{
		int n;
		n=Integer.parseInt(ar[0]);
		switch(n)
		{
			case 2:
			System.out.println("Red color");
			break;
			case 4:
			System.out.println("Green color");
			break;
			case 6:
			System.out.println("yellow color");			
			case 8:
			System.out.println("orange color");
			break;
			case 10:
			System.out.println("Blue color");
			break;
		default :
			System.out.println(" Black Color");
		}
	}
}