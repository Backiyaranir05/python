import java.util.*;
import java.lang.*;
import java.io.*;
class StringClass
{
  public void printWord()
  {
    String str=new String("Hello");
    System.out.println(str);
  }
}
class NumberString extends StringClass{
  public void print()
  {
  String strnum=new String("12345");
  System.out.println(strnum);
  }
  
	public static void main (String[] args) throws java.lang.Exception
	{
		NumberString ns=new NumberString();
        ns.printWord();
        ns.print();
	}
}
