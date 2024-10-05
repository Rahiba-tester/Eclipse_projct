package assignments;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	
		int f=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			f=f*i;
		}
		System.out.println("the factorial of given number is:"+f);
		
	}

}
