import java.util.ArrayList;
import java.util.ListIterator;

import javax.swing.GroupLayout.Alignment;

public class ArrayListEx3 {
//ListIterator
	public static void main(String[] args) {

		ArrayList <String> al = new ArrayList<String>();
		al.add("Naresh");
		al.add("Suresh");
		al.add("Mahesh");
		al.add("Rakesh");
		al.add("Mallesh");
		ListIterator li = al.listIterator();
		System.out.println(li.hasNext());
		System.out.println(li.hasPrevious());
		while(li.hasNext())
		{
			Object o = li.next();
			System.out.println(o);
			
		}
		
	}

}
