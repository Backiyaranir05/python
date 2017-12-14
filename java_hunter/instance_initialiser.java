import java.util.*;
import java.lang.*;
import java.io.*;
class GUVI
{
  String str=new String("Hello");
  
  {
    System.out.println(str);
  }
  
  GUVI(){
    System.out.println("Hi am constructor");
  }
  
	public static void main (String[] args) throws java.lang.Exception
	{
		GUVI g=new GUVI();
	}
}
