
package basics;

public class Swap {

	public static void main(String[] args) {
		int a=65;
		int b=23;
		System.out.println("numbers before swaaping is:" +a +" " +b);
		a=a+b;  //a=25+23=48
		b=a-b;  //b=48-23=25
		a=a-b; //a=48-25=23
		System.out.println("numbers after swaping :" +a +" " +b);
	
		
		  //with using 3rd variable
		int temp;
		int x=100;
		int y=200;
		temp=x; //100
		x=y; //200
		y=temp; //100
		System.out.println("After swaping:"+x +"  " +y);
		 
		
	}

}
