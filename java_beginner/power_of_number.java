import java.io.*;
import java.util.*;
public class Power {

    public static void main(String[] args) {

        int base, exponent,power;
        Scanner s=new Scanner(System.in);
        base=s.nextInt();
        power=s.nextInt();
        long result = 1;

        for (exponent=power;exponent>0; --exponent)
        {
            result *= base;
        }

        System.out.println("Answer = " + result);
    }
}
