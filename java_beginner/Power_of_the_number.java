import java.io.*;
import java.util.*;
public class Power {

    public static void main(String[] args) {

        int base,i,power;
        Scanner s=new Scanner(System.in);
        base=s.nextInt();
        power=s.nextInt();
        long result = 1;
  if(power<0)
  {
      System.out.println("Enter positive value for power");
  }
  else if(power==0){
      System.out.println("1");
  }
  else
  {
        for (i=power;i>0; --i)
        {
            result *= base;
        }

        System.out.println("Answer = " + result);
    }
}
}
