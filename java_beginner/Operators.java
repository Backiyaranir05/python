
import java.lang.*;
import java.io.*;
class GUVI
{
  int a=5;
  int b=10;
  int c=a+b;
  int d=a-b;
  int e=b/a;
  int f=b%a;
  int g=b++;
  int h=b--;
  int i=a&b;
  int j=a|b;
  int k=a^b;
  int l=~a;
  int m=a<<2;
  int n=b>>2;
  int o=a>>>2;
  int p=a&&b;
  int q=a||b;
  int r=!(a&&b);
  public void print()
  {
    System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+e+"\n"+f+"\n"+g+"\n"+h+"\n"+i+"\n"+j+"\n"+k+"\n"+l+"\n"+m+"\n"+n+"\n"+o+"\n"+p+"\n"+q+"\n"+r+"\n");
  
	public static void main (String[] args) throws java.lang.Exception
	{
		GUVI g=new GUVI;
        g.print();
	}
}
