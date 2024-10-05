package oops_concept;

// default constructor
public class Employee_constructor {
	
	// define instance variables
	int empid;
	int salary;
	String designation;
	
	public Employee_constructor()     // created Constructor
	{
		empid=100;
		salary=650000;
		designation="Tester";
		
	}
  public static void main(String[] args)
  {
	  Employee_constructor ob=new Employee_constructor();
	  System.out.println(ob.empid);
	  System.out.println(ob.salary);
	  System.out.println(ob.designation);
	  
	  
  }
	
}
