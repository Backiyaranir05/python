import java.util.*;
import java.lang.*;
import java.io.*;
class GUVI
{
	public static void main (String[] args) throws java.lang.Exception
	{
      int sum=0;
		ArrayList<int> list=new ArrayList<int>;
        list.add(10);
        list.add(20);
        list.add(30);
      for(int i:list)
      {
        sum=sum+i;
        
	}
      int avg=sum/3;
      System.out.println("avg of array elements is:"+avg);
}
