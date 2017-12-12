import java.util.Scanner;
import java.io.*;
public class LargerNumber {
    public void checkNumber(){
         int a,b,c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if((a>b)&&(a>c))
              System.out.println(a);
        else if((b>a)&&(b>c))
              System.out.println(b);
        else((c>a)&&(c>b))
              System.out.println(c);
    }
public static void main(String args[])
    {
       
       LargerNumber  pn= new  LargerNumber();
       pn.checkNumber();
    }
}
