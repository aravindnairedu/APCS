package edu.kyleknobloch.APCS.Classwork.Febuary;

public class RecursiveSum
{
   public static void main(String args[])
   {
      System.out.println("Using a For Loop to Add!");
      System.out.println("Sum is " + Addit(10));
      
      //System.out.println("Now Using Recursion:");
      //System.out.println("Sum is: " + Sum(10));
      
   } // end class
   
   public static int Addit(int num)
   {
      int sum = 0;
      
      for ( int i = 0; i <= num; i++)
      {
         sum += i;
      }
      
      return sum;
   } // end Addit()
   
   public static int Sum(int num)
   {
      if ( num > 0 )
         return num + Sum(num - 1);
     
     
      return (num);
         
   } // end Sum()
   
} // end class