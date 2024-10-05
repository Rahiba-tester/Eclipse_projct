package basics;

public class Logicaloperators {

	public static void main(String[] args) {
		String username="abc";
		String password="abcdefg";
		System.out.println(username=="abc"&& password=="abcdefg" );
		System.out.println(username=="abc"&& password=="hhhh" );
		System.out.println(username=="abc" || password=="abcdefg" );
		System.out.println(username=="abc");
		System.out.println(!(username=="abc"));   
		 
		
		/*	boolean x=true;
		boolean y= false;
		System.out.println(x&&y);
		//System.out.println(xy);
		System.out.println(!x);
		System.out.println(!y);

		
		  */
	}

}
