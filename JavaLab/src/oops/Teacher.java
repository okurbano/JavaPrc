package oops;

class Subject
{
	int code;
	String name;
	 static String unv="UCM"; 
	
	void read(int x, String y)
	
	{
		this.code= x;
		this.name=y;
		
	}
	void display()
	{
		System.out.println("subject code= "+code+" Sname= "+name+"unv name= "+unv);
	}
	
	static void result()
	{
		unv="Dayton";
	}
	
}
public class Teacher {

	public static void main(String[] args) {
		
		Subject.result();//
		Subject u1= new  Subject();
		u1.read(101, "raju");
		u1.display();
		
		Subject u2 = new  Subject();
		u2.read(102, "kiran");
		u2.display();

	}

}
