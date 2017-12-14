import java.util.*;
import java.lang.*;
import java.io.*;
class LCMofNumbers
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num1,num2,lcm;
      Scanner s=new Scanner(System.in);
      num1=s.nextInt();
      num2=s.nextInt();

        lcm = (num1 > num2) ? num1 : num2;


        while(true)
        {
            if( lcm % num1 == 0 && lcm % num2 == 0 )
            {
                System.out.println( lcm);
                break;
            }
            ++lcm;
        }
	}
}
