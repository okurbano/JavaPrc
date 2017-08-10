package swings;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingEx1  extends JFrame{

	public static void main(String[] args) {
		
		SwingEx1  sw = new SwingEx1();
		
		JButton b1 = new JButton("Submit");
		b1.setBounds(100,100,150,50);
		
		sw.add(b1);
		sw.setSize(600,400);
		sw.setLayout(null);
		sw.setVisible(true);

	}

}
