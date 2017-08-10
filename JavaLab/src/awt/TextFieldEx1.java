package awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;

public class TextFieldEx1 extends Frame {

	public static void main(String[] args) {
		
		TextFieldEx1 tx= new TextFieldEx1();
		
		TextField t1= new TextField();
		TextField t2= new TextField();
		
		Button b = new Button("Submit");
		t1.setBounds(100, 100, 250, 50);
		t2.setBounds(100, 200, 250, 50);
		b.setBounds(400, 100, 150, 75);
		
		tx.add(t1);
		tx.add(t2);
		tx.add(b);
		tx.setSize(750,500);
		tx.setLayout(null);
		tx.setVisible(true);
		
		

	}

}
