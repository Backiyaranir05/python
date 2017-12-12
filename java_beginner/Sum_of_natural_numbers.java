import java.io.*;
import java.util.Scanner;
public class MySum {
    public static void main(String[] args) {
        int x, i  ;
        int sum = 0;
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        for(i=1;i <= x;i++)
        {
            sum = sum +i;
        }
        System.out.println("Sum is :"+sum);
    }
}
