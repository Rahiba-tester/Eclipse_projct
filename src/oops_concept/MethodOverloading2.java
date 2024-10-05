package oops_concept;

public class MethodOverloading2 {
	
	public void add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public void add(int a ,double b)
	{
		double d=a+b;
		System.out.println(d);
	}

	public static void main(String[] args) {
		MethodOverloading2 ov1=new MethodOverloading2();
		ov1.add(5, 11);
		ov1.add(4, 6.6);

	}

}
