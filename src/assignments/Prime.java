package assignments;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		 if(n==0||n==1)
		 {
			 System.out.println("The number is not prime");
		 }
		 else
		 {
			if(n%2==0)
			{
				System.out.println("The number not prime");
				
			}
			else
			{
				System.out.println("The number is prime");
			}
		 }
		

	}

}
