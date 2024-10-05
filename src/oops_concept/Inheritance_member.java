package oops_concept;

class Members
{
	String name;
	int age;
	String address;
	int salary;
	public void printdetails()   //method to print details
	{
		
		System.out.println("name:"+name);
		System.out.println("age="+age);
		System.out.println("address:"+address);
		System.out.println("salary:"+salary);
		
	}
}

class Worker extends Members
{    
	String specialisation;
	
}  

class Manager extends Members
{   
	String department;

}
public class Inheritance_member {

	public static void main(String[] args) {
		Worker w=new Worker();
		w.name="rahiba";
		w.age=25;
		w.address="fghj";
		w.salary=60000;
		w.printdetails();
		
		w.specialisation="selenium";
		System.out.println("specialisation="+w.specialisation);
		
		Manager m=new Manager();
		m.name="Anu";
		m.age=30;
		m.address="jdfk";
		m.salary=80000;
		m.printdetails();
		
		m.department="it";
		System.out.println("department="+m.department);

	}

}
