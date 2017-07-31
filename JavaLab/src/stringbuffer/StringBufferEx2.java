package stringbuffer;

public class StringBufferEx2 {

	public static void main(String[] args) {
		 StringBuffer name =new StringBuffer("suresh");
			System.out.println("Name  = "+name);
			System.out.println("Length = "+name.length());
			System.out.println("Capacity = "+name.capacity());
			name.append("raj");
			System.out.println("after append = "+name);
			System.out.println("Capacity = "+name.capacity());
			name.append("abcabcabcabcabcabcabcabcabc");
			
			System.out.println("Length = "+name.length());
			System.out.println("Capacity = "+name.capacity());

	}

}
