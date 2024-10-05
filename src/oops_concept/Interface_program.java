package oops_concept;

interface Whatsappcalls
{
	int a=10;
	void calls();
	void mute();
	void disconnect();
}

class Audiocalls implements Whatsappcalls
{

	@Override
	public void calls() {
	System.out.println("whatsapp audio call");
		
	}

	@Override
	public void mute() {
		System.out.println("Whatsapp call muted");
		
	}

	@Override
	public void disconnect() {
		System.out.println("whatsapp call disconnected");
	
		
	}
	
}


class Videocalls implements Whatsappcalls
{

	@Override
	public void calls() {
		System.out.println("video calls");
		
	}

	@Override
	public void mute() {
		System.out.println("video calls muted");
		
	}

	@Override
	public void disconnect() {
		System.out.println("video calls disconnected");
		
	}
	
}
public class Interface_program {

	public static void main(String[] args) {
		Audiocalls a=new Audiocalls();
		a.calls();
		a.disconnect();
		a.mute();
		
		Videocalls v=new Videocalls();
		v.calls();
		v.disconnect();
		v.mute();
		
		Whatsappcalls ob=new Audiocalls();
		ob.calls();
		ob.disconnect();
		ob.mute();
		
		ob=new Videocalls();
		ob.calls();
		ob.disconnect();
		ob.mute();
		
		
		System.out.println(Whatsappcalls.a);
	//	System.out.println(Whatsappcalls.a=20);

	}

}
