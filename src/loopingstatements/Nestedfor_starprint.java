package loopingstatements;

public class Nestedfor_starprint {

	public static void main(String[] args) {
		for(int i=1; i<=3; i++) 
		{
			for(int j=1; j<=4; j++)
			{ 
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		for(int i=1; i<=4;i++)
		{
			for(int j=1; j<=3; j++)
			{
				System.out.print("*"+ "  ");
			}
		System.out.println();
		}
		
	}

}
