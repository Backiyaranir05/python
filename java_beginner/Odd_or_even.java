import java.util.*;
import java.io.*;
public class OddOrEven{
    public int number;
    public void checkNumber(){
        Scanner s=new Scanner(System.in);
       number=s.nextInt();
        
        if(number%2==0)
            System.out.println("Even number");
        
        else
            System.out.println("Odd number");
    }
    public static void main(String[] args) throws Exception
    {
         OddOrEven oe=new OddOrEven();
          oe.checkNumber();
    }
}
