package oops_concept;

public class Employee {
	
	String employee_name;
	int emp_id;
	String designation;
	int salary;
	
	public void display() //method to print
	{
		System.out.println(employee_name);
		System.out.println(emp_id);
		System.out.println(designation);
		System.out.println(salary);
	}


public static void main(String[] args) //main method 
{
	Employee ob=new Employee(); //create object to access variables and methods
	ob.employee_name="Akash";
	ob.emp_id=101;
	ob.designation="manager";
	ob.salary=30000;
	ob.display();  // call the method dispay
}
} 