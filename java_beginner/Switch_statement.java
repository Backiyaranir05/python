import java.util.*;
import java.lang.*;
import java.io.*;
class PizzaOffer
{
  public void pizza()
  {
    int dayOfTheWeek;
    Scanner s=new Scanner(System.in);
    dayOfTheWeek=s.nextInt();
    Switch(dayOfTheWeek)
    {
      case 0:
      System.out.println("Sunday:Free Personal Pizza on purchase of medium Pizza");
      break;
      
      case 1:
      System.out.println("Monday:Rs.101 OFF on a bill of Rs.400 and above");
      break;
      
      case 2:
      System.out.println("Tuesday:Free Plain Garlic Bread on another medium pizza");
      break;
      
      case 3:
      System.out.println("Wednesday:Buy 1 Get 1 Free on any medium pizza");
      break;
      
      case 4:
      System.out.println("Thursday:Buy any medium pizza and get 50% off on another medium pizza");
      break;
      
      case 5:
      System.out.println("Friday:Tastiest pizza 20% off on bill of Rs.399 or above");
      break;
      
      case 6:
      System.out.println("Saturday:Get Together Offer Free Garlic Bread and Dip on a min bill of Rs.350");
      break;
      
      default:
      System.out.println("Enter correct choice");
    }
  }
      
	public static void main (String[] args) throws java.lang.Exception
	{
	PizzaOffer g=new PizzaOffer;
      g.pizza();
    }
}
