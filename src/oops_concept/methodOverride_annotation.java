package oops_concept;


class Car
{
	 public void speed()
	 {
		 System.out.println("car speed");
		 
	 }
	 public void power()
	 {
		 System.out.println("car power");
	 }
}

class Bmw extends Car
{

	@Override
	public void speed()
	{
		System.out.println("bmw speed");
		super.speed();
	}

	@Override
	public void power() 
	{
	    System.out.println("bmw power");
		super.power();
	}
	
}

public class methodOverride_annotation {

	public static void main(String[] args) {
		Bmw b=new Bmw();
		b.power();
		b.speed();
		
	}

}
