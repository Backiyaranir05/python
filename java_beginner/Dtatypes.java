import java.util.*;
import java.lang.*;
import java.io.*;
class GUVI
{
  String name="Sridevi";
  String city="Chennai";
  int age=32;
  int height=53;
  boolean married=true;
  char sex='F';
  double population=4,828,853;
  public void print(){
     System.out.println("Name:"+name);
     System.out.println("City:"+city);
     System.out.println("Age:"+age);
     System.out.println("Height:"+height);
     System.out.println("Married:"+married);
     System.out.println("Sex:"+sex);
     System.out.println("City population:"+population);
  }
	public static void main (String[] args) 
	{
		GUVI g=new GUVI(System.in);
        g.print();
	}
}
