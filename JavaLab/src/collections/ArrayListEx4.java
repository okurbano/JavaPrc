package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class ArrayListEx4 {

	public static void main(String[] args) {
		ArrayList <String> al = new ArrayList<String>();
		al.add("Naresh");
		al.add("Suresh");
		al.add("Mahesh");
		al.add("Rakesh");
		al.add("Mallesh");
		
		Enumeration  en = Collections.enumeration(al);
		while(en.hasMoreElements())
		{
			Object obj = en.nextElement();
			System.out.println(obj);
		}

	}

}
