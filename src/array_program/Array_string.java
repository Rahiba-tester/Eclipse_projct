package array_program;

import java.util.Scanner;

public class Array_string {

	public static void main(String[] args) {
		String arr[]=new String[4];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your names:");
		for(int i=0; i<4; i++)
		{
			arr[i]=sc.next();
		}
		System.out.println("The name is:");
		for(int i=0; i<4; i++)
		{
			System.out.println(arr[i]);
		}

	}

}
