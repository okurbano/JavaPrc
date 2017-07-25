package oops;

class University
{
	int sid;
	String name;
	 static String unv="UCM";  
	void read(int x, String y)
	
	{
		this.sid= x;
		this.name=y;
		
	}
	void display()
	{
		System.out.println("sid= "+sid+" Sname= "+name+" University name = "+University.unv);
	}
}
public class Student {

	public static void main(String[] args) {
		University u1= new  University();
		u1.read(101, "raju");
		u1.display();
		
		University u2 = new  University();
		u2.read(102, "kiran");
		u2.display();

	}

}
