package edu.kyleknobloch.APCS.Classwork.Febuary;

public class Rercursion
{

   public static void main(String args[])
   {
      int count = 10;
      
      Counter(count);
   
   } // end main

   public static int Counter(int count)
   {
      if ( count > 0 )
      {
         System.out.println("1: Calling Counter with " + count);
         Counter(count -1); 
         System.out.println("2: Calling Counter with " + count);
      }
      else
         System.out.println("Base Case");
         
      return (count);
   } // end Counter()
} // end class