package swings;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutEx1 extends JFrame{

	public static void main(String[] args) {
		GridLayoutEx1 gl = new GridLayoutEx1();
		
		JButton b1 = new JButton("10");
		JButton b2 = new JButton("20");
		JButton b3 = new JButton("Add");
		JButton b4 = new JButton("Sub");
		
		gl.add(b1);
		gl.add(b2);
		gl.add(b3);
		gl.add(b4);
		
		gl.setLayout(new GridLayout(3,3));
		gl.setSize(500,500);
		gl.setVisible(true);
		gl.setTitle("My Calculator");
		
		

	}

}
