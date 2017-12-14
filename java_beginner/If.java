
import java.lang.*;
import java.io.*;
class GUVI
{
  public void CheckHitFlop()
  {
   if(DaysInTheatre>=50)
     System.out.println("Box office Hit");
   else
     System.out.println("Flop");
  }
  
	public static void main (String[] args) throws java.lang.Exception
	{
      GUVI g=new GUVI;
	int DaysInTheatre;
      Scanner s=new Scanner(System.in);
      DaysInTheatre=s.nextInt();
      g.CheckHitFlop();
	}
}
