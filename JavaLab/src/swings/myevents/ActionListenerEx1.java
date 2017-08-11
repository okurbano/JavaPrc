package swings.myevents;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;



public class ActionListenerEx1 extends JFrame implements ActionListener {
	TextField tf1 ;
	JButton b1;
	JButton b2;
	ActionListenerEx1()
	{
		tf1= new TextField("Write something");
		b1 = new JButton("Click");
		b2 = new JButton("cancel");
		
		tf1.setBounds(100,100,150,50);
		b1.setBounds(100,200,150,50);
		b2.setBounds(100,300,150,50);
		
		add(tf1);
		add(b1);
		add(b2);
		setSize(500,500);
		b2.addActionListener(this);
		setLayout(null);
		setVisible(true);
		
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		tf1.setText("U clicked me");
	}
	
	
	public static void main(String ar[])
	{
		new ActionListenerEx1();
		
	}	


}


