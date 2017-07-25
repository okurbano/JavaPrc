package control;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to Find Factors : ");
		num=sc.nextInt();
		System.out.println(" Factors are : ");
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
			}
		}
	}

}
