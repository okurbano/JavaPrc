package inheritance;

class AudiA4
{
	final void limit()
	{
		System.out.println(" Danger Zone after 70 ");
	}
	void maxSpeed()
	{
		System.out.println(" Speed Limit is 220");
	}
}
class AudiA6 extends  AudiA4
{
	
	void maxSpeed()
	{
		System.out.println(" Speed limit is 260");
	}
	
}

public class FinalMethod {

	public static void main(String[] args) {
	AudiA6 a = new AudiA6();
	a.maxSpeed();
	a.limit();

	}

}
