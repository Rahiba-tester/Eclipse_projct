package oops_concept;

public class Employee_method {
	
	int empid;
	int salary;
	String designation;
	
	/*  public void setvalues(int empid, int salary, String designation)
	{
		this.empid=empid;
		this.salary=salary;
		this.designation=designation;
	}    */
	public void setvalues(int id, int sal, String desig)
	{
		empid=id;
		salary=sal;
		designation=desig;
	}
	
	
	public void display()
	{
		System.out.println("empid:"+empid);
		System.out.println("salary:"+salary);
		System.out.println("desig:"+designation);
	}
	
	public static void main(String[] args)
	{
	Employee_method ob=new Employee_method();
	ob.setvalues(100,60000,"tester");
	ob.display();
	
	
	}
	
	

}
