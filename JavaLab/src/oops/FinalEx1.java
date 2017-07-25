package oops;


class Laptop{
	void model()
	{
		System.out.println(" The Model of laptop is L100");
	}
}
final class Lenovo extends Laptop
{
	void latestModel()
	{
		System.out.println(" The latest model Yoga Pad y700");
		
	}
}


public class FinalEx1 {

	public static void main(String[] args) {
		
		 Lenovo l = new Lenovo();
		 l.latestModel();

	}

}
