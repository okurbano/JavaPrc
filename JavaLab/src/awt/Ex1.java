package awt;

import java.awt.Button;
import java.awt.Frame;

public class Ex1  extends Frame{

	public static void main(String[] args) {
		
		Ex1 e = new Ex1();
		Button b = new Button("Submit");
		Button b2 = new Button("Cancel");
		b.setBounds(100, 100, 150, 75);
		b2.setBounds(300,100,150,75);
		e.add(b);
		e.add(b2);
		e.setSize(500,500);
		e.setLayout(null);
		e.setVisible(true);

	}

}
