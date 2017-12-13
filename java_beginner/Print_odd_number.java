import java.io.*;
import java.util.*;
public class PrimeExample{
 public static void main(String args[]){
  int i,firstNumber,lastNumber;
  Scanner s=new Scanner(System.in);
  firstNumber=s.nextInt();
  lastNumber=s.nextInt();
   for(i=firstNumber;i<=lastNumber;i++)
   {
    if(i%2!=0){
     System.out.println(i);
    }
   }
}
}
