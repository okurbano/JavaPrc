package swings;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx1 extends JFrame {

	public static void main(String[] args) {
		BorderLayoutEx1 br = new BorderLayoutEx1();
		
		JButton b1 = new JButton("Header");
		JButton b2 = new JButton("Footer");
		b1.setBackground(Color.CYAN);	
		b2.setBackground(Color.GREEN);
		
		br.add(b1,BorderLayout.NORTH);
		br.add(b2,BorderLayout.SOUTH);
		
		br.setSize(500,500);
		br.setVisible(true);
		

	}

}
