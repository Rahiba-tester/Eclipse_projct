package string_functions;

public class String_fns {

	public static void main(String[] args) {
	String s="welcome";
	System.out.println(s.length());  // find string length
	int a=s.length();
	System.out.println("Length :"+a);
	
	String s1="hello  ";
	String s2="Luminar";
	System.out.println(s1.concat(s2));  // to add 2 strings
	
	
	System.out.println(s1+s2);
	System.out.println(1+2+s1);
	System.out.println(s1+1+2);
	
	  String s3="Luminar123";
	  System.out.println(s3.toLowerCase());
	  System.out.println(s3.toUpperCase());
	  System.out.println(s3.endsWith("3"));
	  System.out.println(s3.startsWith("U"));
	  System.out.println(s3.startsWith("L"));
	  
	  String x="abc";
	  String y="Abc";
	  System.out.println(x.equals(y));
	  System.out.println(x.equalsIgnoreCase(y));
	 
	  System.out.println(y.contains("A"));
	  
	  String q="   hello";
	  System.out.println(q);
	  System.out.println(q.trim());
	  
	  String y1="welcome"; //0 1 2 3 4 5 
	  System.out.println(y1.substring(3));
	  System.out.println(y1.substring(0,4));//starting index :012345,ending index:123456
	  
	  String m="welcome to luminar";
	  System.out.println(m.replace("come","done"));
	  
	  
	  //to display a particular character
	  String z="welcome";
	  System.out.println(z.charAt(4));
	  
	  //split
	  String w1="welcome to luminar";
	  
	  String w[]=w1.split(" "); // call the method split
	  for (String r:w) // for each loop 
	  {
		  System.out.println(r);
	  }
	  
	  //split the characters
	  
	  String k1="welcome";
	  char k[]=k1.toCharArray(); //call the method toCharArray()
	  for(char n:k)
	  {
		  System.out.println(n);
	  }
		  
	  
	/*  String f1="hello";
	  for (int i=0; i<=4; i++)
	  {
		  System.out.println(f1.charAt(i));
	  } */
		  
	
	  
	  
	  
	}

}
