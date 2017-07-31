package strings;

public class StringComparEx {

	public static void main(String[] args) {
		String s1= "HELLO";
		String s2= new String("Hello");
		String s3=new String("HIRL");
		
		int result = s1.compareTo(s2);
		int result2=s1.compareTo(s3);
		System.out.println("result  =" +result);
		System.out.println("result2  =" +result2);
		
	}

}
