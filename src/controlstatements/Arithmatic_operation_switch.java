package controlstatements;

public class Arithmatic_operation_switch {

	public static void main(String[] args) {
	 char a='+';
	int b=9 ;
	int c=5;
	int r;
	switch(a)
	{
	case '+':
		r=b+c;
		System.out.println("sum of the numbers is:"+r);
		break;
	case '-':
		r=b-c;
		System.out.println("difference of the no is:"+r);
		break;
	case '*':
		r=b*c;
		System.out.println("The product of the numbers is:"+r);
		break;
	case '/':
		r=b/c;
		System.out.println("the division of two number is: "+r);
		break;
		default:
			System.out.println("invalid operator");
	}
		
	}

}
