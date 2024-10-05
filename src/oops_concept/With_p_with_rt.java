package oops_concept;

public class With_p_with_rt {
	

	//method with parameter and with return type
	public int sub(int a,int b)
	{
		int c= a-b;
		return c;
	}
	
	public static void main(String[] args)
	{
		With_p_with_rt ob=new With_p_with_rt();
		System.out.println(ob.sub(50,20));
	}

}
