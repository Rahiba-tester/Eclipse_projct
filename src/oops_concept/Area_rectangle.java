package oops_concept;

public class Area_rectangle {
	
	// without parameter with return type
	public int area()
	{
		int l=25;
		int b=15;
		int a=l*b;
		return a;
	}
	public static void main(String[] args)
	{
		Area_rectangle ob=new Area_rectangle();
		System.out.println(ob.area());
		
	}
}
