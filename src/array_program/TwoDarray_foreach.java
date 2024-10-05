package array_program;

import java.util.Scanner;

public class TwoDarray_foreach {

	public static void main(String[] args) {
		int arr[][]=new int[2][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your values:");
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<3; j++ )
			{
				arr[i][j]=sc.nextInt();
				//System.out.println(arr[i][j]);
					
			}
			
		}
		System.out.println("The entered values are:");
		for(int t[]:arr)  //first row values stored to array t and print completely,then store second row values and print it.
		{
			for(int s:t) // print first row values one by one .
			{
				System.out.print(s+" ");
			}
			System.out.println();	
		}	

	}

}
