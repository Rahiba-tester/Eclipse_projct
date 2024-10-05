package basics;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	//int n=988;
	int r;
	int temp;
	int rev=0;
	//temp=n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=sc.nextInt();
	temp=n;
	while(n>0)
	{
		r=n%10;
		rev=rev*10+r;
		n=n/10;
			
	}
	if(temp==rev)
	{
		System.out.println("The given number is palindrome");
	}
	else
	{
		System.out.println("The given nuber is not palindrome");
	}
	
	}

}
