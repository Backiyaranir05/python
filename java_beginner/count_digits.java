import java.io.*;
import java.util.Scanner;
public class MySum {
    public static void main(String[] args) {
        int n, count ;
        
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for(count=0;n>0;count++)
        {
            n=n/10;
        }
        System.out.println(count);
    }
}
