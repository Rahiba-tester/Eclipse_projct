package assignments;

import java.util.Scanner;

public class Alphabet_Check {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a character:");
		char c=sc.next().charAt(0);
		
		if (Character.isLetter(c))
		{
			System.out.println(c + "  is an alphabet" );
		}
		else
		{
			System.out.println(c +"   is not an alphabet");;
		}
		
	}

}
