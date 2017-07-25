package wrapper;


public class WrapperEx1 {

	public static void main(String[] args) {
		int a=10;
		//convert primitive to Object
		
		Integer i =Integer.valueOf(a);// autoboxing
		
		Integer x = new Integer(100);
		int m=x.intValue();  //unboxing
		
		
		
	}

}
