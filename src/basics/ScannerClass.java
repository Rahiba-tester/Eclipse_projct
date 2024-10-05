package basics;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your names:");
		String name=sc.next();
		
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		
		System.out.println("Enter a character:");
		char c=sc.next().charAt(0);
		
	// System.out.println(String name,int age,char c);
	}

}
