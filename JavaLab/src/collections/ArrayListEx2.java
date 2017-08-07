package collections;

import java.util.ArrayList;
import java.util.Iterator;

//Iterator
public class ArrayListEx2 {

	public static void main(String[] args) {
		ArrayList <String> al = new ArrayList<String>();
		al.add("Naresh");
		al.add("Suresh");
		al.add("Mahesh");
		al.add("Rakesh");
		al.add("Mallesh");
		
		Iterator i = al.iterator();
		while(i.hasNext())
		{
			Object o = i.next();
			System.out.println(o);
			
		}
		
	}

}
