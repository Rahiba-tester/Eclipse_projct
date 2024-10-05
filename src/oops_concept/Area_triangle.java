package oops_concept;

public class Area_triangle {
	
	//with parameter with return type
	public double area(int b, int h)
	{
		double a=0.5*b*h;
		return a;
	}
	public static void main(String[] args)
	{
		Area_triangle ob=new Area_triangle();
		System.out.println(ob.area(18, 15));
	}

}
