class CmdEx5
{
	public static void main(String ar[]) 
	{	
		int c,cpp,java,dot;
		int id;
		int total;
		id=Integer.parseInt(ar[0]);
		c=Integer.parseInt(ar[1]);
		cpp=Integer.parseInt(ar[2]);
		java=Integer.parseInt(ar[3]);
		dot=Integer.parseInt(ar[4]);
		total=c+cpp+java+dot;
		double avg=total/4;
		System.out.println(id+"student marks= " +total);
		System.out.print("  average= " +avg);
	}
}
