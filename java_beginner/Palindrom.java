import java.io.*;
import java.util.*;
public class Palindrom {


 public static void main(String args[]){
  int reminder,sum=0,temp,n;
   Scanner s=new Scanner(System.in);
   n=s.nextInt();

  temp=n;
  while(n>0){
   reminder=n%10;
   sum=(sum*10)+reminder;
   n=n/10;
  }
  if(temp==sum)
   System.out.println("palindrome");
  else
   System.out.println("not palindrome");
}
}
