import java.util.*;
import java.lang.*;
import java.io.*;
class GUVI
{
  public void generateCoupon()
  {
    int amount;
    Scanner s=new Scanner(System.in);
    System.out.println("Purchased Amount");
    amount=s.nextInt();
    if(amount>=20000)
      System.out.println("Free Trolley Suitcase");
    else if(amount>=10000)
      System.out.println("Free Travel Bag");
    else if(amount>=5000)
      System.out.println("Free Backpck");
    else if(amount<5000)
      System.out.println("Collect money even for cover we give");
    else
      System.out.println("Nandri! Meendum Varuga!");
  }
    public static void main (String[] args) throws java.lang.Exception
	{
            GUVI g=new GUVI;
            g.generateCoupon();
	}
}
