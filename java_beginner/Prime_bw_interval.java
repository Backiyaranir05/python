import java.io.*;
import java.util.*;
public class PrimeExample{
 public static void main(String args[]){
  int i,j,flag=0,firstNumber,secondNumber;
  Scanner s=new Scanner(System.in);
  firstNumber=s.nextInt();
  secondNumber=s.nextInt();
   for(i=firstNumber;i<=secondNumber;i++)
   {
        for(j=2;j<i;j++)
        {
    if(i%j==0)
    {
    flag=0;
    break;
    }
    else
    {
     flag=1;
    }
  
   }
          if(flag==1)
         System.out.println(i);
        
  }
}
}
