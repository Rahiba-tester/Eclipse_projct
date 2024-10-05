package array_program;

import java.util.Scanner;

public class For_each_array {

	public static void main(String[] args) {
		int arr[]=new int[4];
		Scanner sc=new Scanner(System.in); //create object
		System.out.println("Enter the numbers");
		for (int i=0; i<4; i++)
		{
			 arr[i]=sc.nextInt(); //nextInt is used to read the values
		}
		System.out.println("The numbers are:");
		for(int s:arr)// s is temporary  variable to store integers, this is for each loop. the values in array arr is now stored in variable s as one by one and print one by one.
		{
			System.out.println(s);
		}
	}

}
