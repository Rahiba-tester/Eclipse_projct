package oops_concept;

public class Area_circle {
	//without parameter without rt
	public void area()

	{
		int r=7;
		double a= 3.14*r*r;
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		Area_circle ob=new Area_circle();
		ob.area();
	}
}
