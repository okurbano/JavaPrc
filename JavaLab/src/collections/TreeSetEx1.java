package collections;

import java.util.TreeSet;

public class TreeSetEx1 {

	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<String>();
		ts.add("ravi");
		ts.add("arun");
		ts.add("tharun");
		ts.add("varun");
		ts.add("kiran");
		ts.add("arun");
		
		for(String s  : ts)
		{
			System.out.println(s);
		}
		
		
		
	}

}
