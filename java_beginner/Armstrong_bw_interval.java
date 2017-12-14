import java.util.Scanner;

public class JavaProgram
{
    public static void main(String args[])
    {
        int  num,n, sum, rem,s1,s2;
        Scanner scan = new Scanner(System.in);
        s1=scan.nextInt();
        s2=scan.nextInt();
        num=s1;
       while(num<=s2)
       {
         n=num;
         sum=0;
        while(n != 0)
        {
            rem = n%10;
            sum = sum + rem*rem*rem;
            n = n/10;
        }
        if(sum == num)
        {
            System.out.print(num);
        }
        num++;
    }
}
}
