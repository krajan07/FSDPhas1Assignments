package Day2;
/*
 *String t= "Delhi";    
  String o = "Mumbai";  
  String k= "delhi";    
  String y= new String ("Mumbai");    
  String l= new String ("delhi");   
  String p = new String("Hello");   
  equals and == 
  (1) o with l 
  (2) y with p 
  (3) t with o 
  (4) k with y 
  (5) p with y 
 * */

public class StringsAssign {

	public static void main(StringsAssign[] args) {
		//Declaring variables
		String t= "Delhi";    
		String o = "Mumbai";  
		String k= "delhi";    
		String y= new String ("Mumbai");    
		String l= new String ("delhi");   
		String p = new String ("Hello"); 
		
		//Check & print using if-else loop
		if (o == l)
		{
			System.out.println("o & l Memory location same");
		}
		else 
		{
		    System.out.println("o & l Memory location different");
		}
		
		//Check & print using if-else loop
		if (y == p)
		{
			System.out.println("y & p Memory location same");
		}
		else 
		{
		    System.out.println("y & p Memory location different");
		}
		
		//Check & print using if-else loop
		if (t == o)
		{
			System.out.println("t & o Memory location same");
		}
		else 
		{
		    System.out.println("t & o Memory location different");
		}
		
		//Check & print using if-else loop
		if (k == y)
		{
			System.out.println("k & y Memory location same");
		}
		else 
		{
		    System.out.println("k & y  Memory location different");
		}
		
		//Check & print using if-else loop
		if (p == y)
		{
			System.out.println("k & y Memory location same");
		}
		else 
		{
		    System.out.println("k & y  Memory location different");
		}
		
	}

}
