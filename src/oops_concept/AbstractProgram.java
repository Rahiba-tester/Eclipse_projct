package oops_concept;

// create abstract class
abstract class Google
{      
	  abstract void dispalay(); //create abstract method (End with semicolon)
	  public void search()      //create non abstract method
	  {
		  System.out.println("Search Details");
	  }
}

//child class created to give different implementations
class SearchAll extends Google
{

	@Override
	void dispalay() {
		System.out.println("Search all details");
		
	}
	
}


class SearchImage extends Google
{

	@Override
	void dispalay() {
	System.out.println("Search image details");
		
	}
	
}

class SearchVideo extends Google
{

	@Override
	void dispalay() {
		System.out.println("search video details");
	}
	
}


public class AbstractProgram {

	public static void main(String[] args) {
		SearchAll s1=new SearchAll();
		s1.dispalay();
		s1.search();
	
		SearchImage s2=new SearchImage();
		s2.dispalay();
		s1.search();
		
		SearchVideo s3=new SearchVideo();
		s3.dispalay();
		s1.search();
		
	
	}

}

