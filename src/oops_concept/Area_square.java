package oops_concept;

public class Area_square {  //class

	//with parameter and without rt
	public void area(int a) //method
	{
		int c=a*a;
		System.out.println(c);
	}
	
	
	public static void main(String[] args) //main function
	{
		Area_square ob=new Area_square(); //object
		ob.area(14); //object call  the method
		
	}
}
