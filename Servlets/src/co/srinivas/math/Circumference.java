package co.srinivas.math;

import java.util.Scanner;

public class Circumference {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius :" );
		double radius=sc.nextDouble();
		double  coc=2*Helpers.PI*radius;
		System.out.println("Circumference of CIrcle  = "+coc);
		System.out.println("I am working in "+Helpers.CEC);
		

	}

}
