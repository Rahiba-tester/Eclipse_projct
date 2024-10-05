package basics;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int num;
		int f=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your digit");
		num=sc.nextInt();
		for (int i=1; i<=num; i++)
		{
		f=f*i;
		}
		System.out.println("The factorial of "+num +" is " +f);
		
	}

}
