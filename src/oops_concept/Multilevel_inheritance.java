package oops_concept;

class Rabbit
{
	public void running()
	{
		System.out.println("rabbit is running");
	}
}
 
class Lion extends Rabbit
{
	public void roaring()
	{
		System.out.println("lion is roaring");
	}
}

class Tiger extends Lion
{
	public void sleeping()
	{
		System.out.println("tiger is sleeping");

	}
}
public class Multilevel_inheritance {
	public static void main(String[] args)
	{
		Lion l=new Lion();
		Tiger t=new Tiger();
		l.roaring();
		l.running();
		t.roaring();
		t.running();
		t.sleeping();
		
	}
}	
	