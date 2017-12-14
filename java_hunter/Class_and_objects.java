
import java.lang.*;
import java.io.*;
class Calci
{
  public void addition(int a,int b)
  {
    sum=a+b;
  }
  public void subtraction(int a,int b)
  {
    diff=a-b;
  }
  public void multiplication(int a,int b)
  {
    product=a*b;
  }
  public void division(int a,int b)
  {
   div=a/b;
  }
  
  
	public static void main (String[] args) throws java.lang.Exception
	{
		int x,y;
        GUVI g=new GUVI();
        Scanner s=new Scanner(System.in);
        x=s.nextInt();
        y=s.nextInt();
        g.addition(x,y);
        g.subtraction(x,y);
        g.multiplication(x,y);
        g.division(x,y);
        System.out.println("Sum is:"+sum);
        System.out.println("Difference is"+diff);
        System.out.println("Product is:"+product);
        System.out.println("Division is:"+div);                   
	}
}
