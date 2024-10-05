package assignments;

import java.util.Scanner;

public class Count_vowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.next();
		
		  int count =0;
		// String s= "India is my country";
		 
         s=s.toLowerCase();
         
         for(int i=0; i<s.length(); i++)
         {
        	 if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
        	 {
        		 count++;
        		 
        	 }
        	 
         }
         
         System.out.println("number of vowels is : " +count);
	}
	

}
