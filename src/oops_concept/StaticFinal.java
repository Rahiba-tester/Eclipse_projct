package oops_concept;

class Schooldetails
{
	  final String Schoolname="Luminar";
	  static String department="English";
	  
}
   
public class StaticFinal {
	
	
	 public static void main(String[] args)
	 {
	
	 System.out.println(Schooldetails.department);  // or System.out.println(department);
	 System.out.println(Schooldetails.department="Malayalam");
	 System.out.println(Schooldetails.department);
	// System.out.println(Schooldetails.);
	 Schooldetails ob=new Schooldetails();
	 System.out.println(ob.Schoolname);
	// System.out.println(ob.Schoolname="abc");   //error ,bcz value of final variable cant change
	 
	 
	 }
	 

}
