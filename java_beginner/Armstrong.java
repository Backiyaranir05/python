import java.util.Scanner;

public class JavaProgram
{
    public static void main(String args[])
    {
        int n, num, sum=0, rem;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        num = n;
        while(num != 0)
        {
            rem = num%10;
            sum = sum + rem*rem*rem;
            num = num/10;
        }
        if(sum == n)
        {
            System.out.print("Armstrong Number");
        }
        else
        {
            System.out.print("Not an Armstrong Number");
        }
    }
}
