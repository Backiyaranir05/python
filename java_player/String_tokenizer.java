import java.util.*;
import java.lang.*;
import java.io.*;
class GUVI
{
	public static void main (String[] args) throws java.lang.Exception
	{
		  StringTokenizer st  = new StringTokenizer(" Mr.Jack,Door No 21,Mason Street,3rd Main Road,Velachery,Chennai,Pin-600113");  
          StringTokenizer st1 = new StringTokenizer(" Ms Jill,Door No 53,Mason Street,3rd Main Road,Velachery,Chennai,Pin-600113");
          StringTokenizer st2 = new StringTokenizer(" Mr Holmes,Door No 13,Valmiki Street,32d Main Road,Saidapet,Chennai,Pin-600115");
          StringTokenizer st3 = new StringTokenizer(" Mr.Davinci,Door No 21,Mason Street,3rd Main Road,Velachery,Chennai,Pin-600113");
      System.out.println("Next token is : " + st.nextToken(","));  
       System.out.println("Next token is : " + st1.nextToken(","));  
       System.out.println("Next token is : " + st2.nextToken(","));  
       System.out.println("Next token is : " + st3.nextToken(","));  
	}
}
