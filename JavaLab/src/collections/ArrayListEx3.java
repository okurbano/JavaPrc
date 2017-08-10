package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//List Iterator 
public class ArrayListEx3 {

	public static void main(String[] args) {
		ArrayList <String> al = new ArrayList<String>();
		al.add("Naresh");
		al.add("Suresh");
		al.add("Mahesh");
		al.add("Rakesh");
		al.add("Mallesh");
		al.add("Mallesh");
		ListIterator li = al.listIterator();
		System.out.println("check status = "+li.hasNext());
		while(li.hasNext())
		{
			Object o = li.next();
			System.out.println(o);
			
		}
		System.out.println("check status = "+li.hasNext());
		System.out.println(" ===================");
		System.out.println("check status from backwards = "+li.hasPrevious());
		System.out.println("value = "+li.previous());
		System.out.println("value = "+li.previous());
		
		

	}

}
