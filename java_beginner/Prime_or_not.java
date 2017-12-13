public class PrimeExample{    
 public static void main(String args[]){    
  int i,m=0,flag=0,n;  
  Scanner s=new Scanner(System.in);
  n=s.nextInt();
  m=n/2;      
  if(n==0||n==1)
  {  
   System.out.println("not prime number");      
  }
  else
  {  
   for(i=2;i<=m;i++)
   {      
    if(n%i==0)
    {       
     flag=1;      
     break;      
    }      
   }      
   if(flag==0) 
   { 
   System.out.println("prime number"); 
   }  
   else
   {
   System.out.println("not prime number");
   }
   
  } 
}    
}   
