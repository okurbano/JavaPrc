package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx1 {

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		hs.add(50);
		System.out.println(hs);
		
		Iterator<Integer> it = hs.iterator();
		while(it.hasNext())
		{
			Object obj = it.next();
			System.out.println(obj);
		}
		
		
		
	}

}
