package myinterface;

public class IpadPro implements Ipad {

	public static void main(String[] args) {
		
IpadPro i = new IpadPro();
i.models();
	}

	@Override
	public void models() {
		System.out.println("Ipad with 64Gb");
		System.out.println("Ipad with 128Gb");
	}

}
