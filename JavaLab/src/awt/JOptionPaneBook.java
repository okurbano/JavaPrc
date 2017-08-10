package awt;

import javax.swing.JOptionPane;

public class JOptionPaneBook {

	public static void main(String[] args) {
		
		String x;
		String y;
		
		int qty,price, total;
		
		x=JOptionPane.showInputDialog("Enter the Book Price" );
		y=JOptionPane.showInputDialog("Enter the Number of Books");
		
		price=Integer.parseInt(x);
		qty=Integer.parseInt(y);
		
		total=price*qty;
		JOptionPane.showMessageDialog(null," Total Book Price is : "+total);


	}

}
