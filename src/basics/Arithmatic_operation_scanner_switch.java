package basics;

import java.util.Scanner;

public class Arithmatic_operation_scanner_switch {

	public static void main(String[] args) {
		char o;
		int a,b,s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first digit:");
		a=sc.nextInt();
		System.out.println("Enter your secend digit");
		b=sc.nextInt();
		System.out.println("Enter the operator");
		o=sc.next().charAt(0);
		
		switch(o)
		{
		case '+':
			s=a+b;
			System.out.println("The sum of the digits is:"+s);
			break;
		case '-':
			s=a-b;
			System.out.println("The difference of the digits is:"+s);
			break;
	
		case '*':
			s=a*b;
			System.out.println("The product of the digits is:"+s);
			break;
		case '/':
			s=a/b;
			System.out.println("The  dividor of the digits is:"+s);
			break;
		default:
			System.out.println("Invalid inputs");
			

		}
		
		
		
	}

}
