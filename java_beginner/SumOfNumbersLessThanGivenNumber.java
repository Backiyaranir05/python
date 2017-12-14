import java.io.*;
import java.util.Scanner;
public class MySum {
    public static void main(String[] args) {
        int n, i  ;
        int sum = 0;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for(i=1;i < n;i++)
        {
            sum = sum +i;
        }
        System.out.println(sum);
    }
}
