package collections;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		ht.put(101,"naresh");
		ht.put(102,"rakesh");
		ht.put(103,"suresh");
		ht.put(null,"kiran");
		Enumeration<Integer> en = ht.keys();
		while(en.hasMoreElements())
		{
			Integer key = en.nextElement();
			System.out.println(" value = " +((Hashtable<Integer, String>) en).get(key));
			
		}	
		

	}

}
