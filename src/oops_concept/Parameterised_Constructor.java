package oops_concept;

//parametarised constructor
public class Parameterised_Constructor {
	
	int empid;
	int salary;
	String designation;
	
	public Parameterised_Constructor(int id, int sal, String desig)  //construtor passing arguments
	{
		empid=id;      //this.empid=empid; to refer  we use this pointer
		salary=sal;
		designation=desig;
		
	}
	
    public static void main(string[] args)
    {
    	Parameterised_Constructor ob=new Parameterised_Constructor(100,90000,"tester");
    	System.out.println(ob.empid);
    	System.out.println(ob.salary);
    	System.out.println(ob.designation);
    	
    	
    }
}
