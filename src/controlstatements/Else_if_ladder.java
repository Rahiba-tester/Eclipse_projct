package controlstatements;

public class Else_if_ladder {

	public static void main(String[] args) {
	int age=18;
		if(age>1 && age<18)
		{
			System.out.println("minor");
        }
		else if (age>=18 && age<60)
		{
			System.out.println("major");
			
		}
		else if (age>60);
		{
			System.out.println("you are retired");
		}
     /* else
      {
			System.out.println("invalid data");
      }   */
	}

}
