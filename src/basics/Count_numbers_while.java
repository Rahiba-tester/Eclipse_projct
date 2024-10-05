package basics;



public class Count_numbers_while {

	public static void main(String[] args) {
	
		
		int num=1234;
		int count=0;
		while(num!=0)
		{
			num/=10; //num=num/10
			count++;
		}
		System.out.println("number of digits:"+count);
			
	}

}
