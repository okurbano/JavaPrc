package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapEx1 {

	public static void main(String[] args) {

		HashMap<Integer,String>  hm= new HashMap<Integer,String>();
		hm.put(101,"Naresh");
		hm.put(102,"Mahesh");
		hm.put(103,"Rakesh");
		hm.put(104,"Rajesh");
		hm.put(105,"Mallesh");
		hm.put(null, "yogesh");
		
		Iterator it = hm.entrySet().iterator();
		
		//display 
		while(it.hasNext())
		{
			Map.Entry e = (Map.Entry) it.next();
			System.out.print(e.getKey()+ "  ");
			System.out.println(e.getValue());
		}
		
		
		
	}

}
