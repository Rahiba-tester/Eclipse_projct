package oops_concept;


class Monkey
{
	public void climbing()
	{
		System.out.println("monkey is climbing");
	}
}

class Fox extends Monkey
{
	public void screaming()
	{
		System.out.println("fox is screaming");
	}
}

class Cow extends Monkey
{
	public void eating()
	{
		System.out.println("cow is eating");
	}
}

public class Heirarchial_inheritance {

	public static void main(String[] args) {
	
		Fox f=new Fox();
		Cow c=new Cow();
		f.climbing();
		f.screaming();
		c.climbing();
		c.eating();
		
	
	}

}
