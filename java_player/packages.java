
import java.util.*;
import java.lang.*;
import java.io.*;
class GUVI
{
  public void addition(int x,int y)
  {
    sum=x+y;
  }
  public void subtraction(int x,int y)
  {
    diff=x-y;
  }
  
	public static void main (String[] args) throws java.lang.Exception
	{
	GUVI g=new GUVI();
      int a,b;
      Scanner s=new Scanner(System.in);
      a=s.nextInt();
      b=s.nextInt();
      g.addition(a,b);
      g.subtraction(a,b);
      System.out.println("Sum is"+sum+"\nDifference is"+diff);
    }
}
