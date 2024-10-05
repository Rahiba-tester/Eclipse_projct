package assignments;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		int r;
		int rev=0;
		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		temp=num;
		while(num>0)
		{
			r=num%10;
			rev=rev*10+r;
			num=num/10;
		}
		if(temp==rev)
		{
			System.out.println("The number is palindrome");
		
		}
		else
		{
			System.out.println("the given number is not palindrome");
		}
		
	}

}
