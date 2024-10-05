package string_functions;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		
		//Q1
		String s="jmeter ";
		String s1="performance testing tool";
		System.out.println(s.concat(s1));
		
	//	Q2  
		String s3="java language is platform independent";
		System.out.println(s3.contains("language")); 
		if(s3.contains("language"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");
		} 
		
			
		//Q3
		
		String s5="selenium webdriver is used for webapplication testing";
		String s6[]=s5.split(" ");
		for(String s7:s6)
		{
			System.out.print("    "+s7);
			
			 if(s7.contains("webapplication"))
			 {
				 break;
			 }
		
		}
		
	}

}
