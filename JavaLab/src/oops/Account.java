package oops;

 public class Account {  
	
	int acc;
	String cname;
	double amt;
	
	public void deposit(int a, String n, double x)
	{
		this.acc=a;
		this.cname=n;
		this.amt=x;
	}
	
	public void display()
	{
		System.out.println("Customer Acc :No = "+this.acc);
		System.out.println("Customer Name : = "+this.cname);
		System.out.println("Customer Balance : = "+this.amt);
	}

}
