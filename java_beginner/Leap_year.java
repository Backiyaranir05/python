import java.io.*;
import java.util.*;

public class Leap {
     public int year;
    public void leapYear(){

        Scanner s=new Scanner(System.in);
        year=s.nextInt();
        if(((year%400==0) && (year%100!=0)) || (year%4==0)){
            System.out.println("Leap year");
        }
        else{
             System.out.println("Not a Leap year");
        }
    }
    
    public static void main(String[] args) {
        Leap l=new Leap();
        l.leapYear();
    }

}
