package awt;

import javax.swing.JOptionPane;

public class JOptionPaneEx1 {

	public static void main(String[] args) {
		
		String fname;
		String lname;
		
		fname=JOptionPane.showInputDialog("Enter you First Name");
		lname=JOptionPane.showInputDialog("Enter the last Name");
		
		String fullname = fname+lname;
		
		JOptionPane.showMessageDialog(null," Full Name = "+fullname);
		System.exit(0);
		
		

	}

}
