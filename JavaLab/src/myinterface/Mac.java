package myinterface;


public class Mac extends IPod implements Ipad
{

	public static void main(String[] args) 
	{
Mac m = new Mac();
m.models();
m.smart();
	}

	@Override
	public void models() {
		System.out.println(" Ipad Mini");
		
	}
	

}
