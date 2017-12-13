import java.io.*;
import java.util.*;
public class PrimeExample{
 public static void main(String args[]){
  int i,firstNumber,secondNumber;
  Scanner s=new Scanner(System.in);
  firstNumber=s.nextInt();
  secondNumber=s.nextInt();
   for(i=firstNumber;i<=secondNumber;i++)
   {
    if(i%2!=0){
     System.out.println(i);
    }
   }
}
}
