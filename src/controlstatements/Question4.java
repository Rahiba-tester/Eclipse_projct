package controlstatements;

public class Question4 {
	public static void main(String[] args) {
		   int a=20, b=30, c=40;
		   if (a>b && a>c) 
		   {
			   System.out.println("The largest number is a:"+a);
		   }
		   else if (b>a && b>c)
		   {
			   System.out.println("The largest no is b:"+b);
			
		   }
		   else // if (c>a && c>b)
		   {
			   System.out.println("The largest no is c:"+c);
		   }
	}

}
