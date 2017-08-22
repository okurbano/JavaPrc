package co.srinivas.math;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius :" );
		double radius=sc.nextDouble();
		double  aoc=Helpers.PI*radius*radius;
		System.out.println("Area of Circle  = "+aoc);
	}

}
