import java.util.*;
import java.lang.*;
import java.io.*;
class GUVI
{
  private String name; 
 
              
      public void setName(String name)              
      {                                             
         this.name = name;      
      }                                             

        
      public String getName()                          
      {                                                
         return name;
      }                                                
	public static void main (String[] args) throws java.lang.Exception
	{
		GUVI g= new GUVI();
      Scanner s=new Scanner(System.in);
      String personName=s.nextLine();
      g.setName(personName);
      System.out.println("The person's name is:"+g.getName());
	}
}
