class PostIncEx2 
{
	public static void main(String[] args) 
	{
		int i=10;
		int j= i++; //11
		j=i++; //12
		System.out.println( " I = "+i);
		++i;
		System.out.println( " I = "+i);
		j=i++;//14
		System.out.println( " I = "+i);  
	}
}
