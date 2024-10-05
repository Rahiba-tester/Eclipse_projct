package oops_concept;

public class MethodOverload3 {
	
	//changing order of datatype
	public void add(int a, double b)
	{
		double s=a+b;
		System.out.println(s);
	}
	public void add(double a, int b)
	{
		double d=a+b;
		System.out.println(d);
		
	}

	public static void main(String[] args) {
		MethodOverload3 ov3=new MethodOverload3();
		ov3.add(6.6, 6);
		ov3.add(8, 3.3);
	
	}

}
