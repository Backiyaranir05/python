import java.util.*;
import java.lang.*;
import java.io.*;
class MyStringClass
{
  public void display()
  {
    System.out.println("Hi java");
  }
}
class ClassMyString extends MyStringClass
{
  
    
	public static void main (String[] args) throws java.lang.Exception
	{
		MyStringClass m=new MyStringClass();
        System.out.println(m instanceof java.lang.String) ;
        
	}
}
