import java.io.*;
import java.util.*;
public class PrintSumOfNumbers {
    public static void main(String[] args) {
       int i,sumn=0,sumo=0;
        for(i=1;i<=15;i++){
            sumn=sumn+i;
        }
       System.out.println(sumn);
       for(i=15;i<=45;i++){
           if(i%2!=0)
           {
               sumo=sumo+i;
           }
       }
        System.out.println(sumo);
    }

}
