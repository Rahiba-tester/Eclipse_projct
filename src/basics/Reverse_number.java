package basics;

public class Reverse_number {

	public static void main(String[] args) {
		 int n=2345;
		 int rev=0;
		 int r;
		 while(n>0)
		 {
			 r=n%10;
			 rev=rev*10+r;
			 n=n/10;
			 
		 }
		 System.out.println(rev);
	}

}
