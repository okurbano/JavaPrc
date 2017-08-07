import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {
ArrayList<String> al = new ArrayList<String>();
al.add("Naresh");
al.add("suresh");
al.add("mahesh");
System.out.println(al);


for(String name : al)
{
	System.out.println(" Hello : "+name);
}
System.out.println(" size = "+al.size());
al.remove(2);
al.remove("Naresh");
System.out.println(" After Removing the = "+al);
System.out.println(" Size  = "+al.size());

	}

}
