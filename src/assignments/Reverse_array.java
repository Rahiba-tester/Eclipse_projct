package assignments;

import java.util.Scanner;

public class Reverse_array {

	public static void main(String[] args) {
	int arr[]=new int[5];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the values");
	
	for(int i=0;i<5;i++)
	{
		arr[i]=sc.nextInt();
		
	}
	
	System.out.println("The given values are");
	for(int i=0;i<5; i++)
	{
		System.out.print(arr[i]+" ");
	} 
	
	System.out.println();
	System.out.println("Reverse of given array is:");
	for(int i=4; i>=0; i--)
	{
		System.out.print(arr[i]+" ");
	}
	}

}
