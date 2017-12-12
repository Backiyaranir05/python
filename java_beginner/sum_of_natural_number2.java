import java.io.*;
import java.util.Scanner;
public class MySum {
    public static void main(String[] args) {
        int n, i  ;
        int sum = 0;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        sum=sum+(n*(n+1)/2);
        System.out.println("Sum is :"+sum);
    }
}
