package edu.kyleknobloch.APCS.Classwork.Febuary;

/**
   This class has a recursive method, message,
   which displays a message n times.
*/

public class Recursive
{
   public static void message(int n)
   {
      if (n > 0)
      {
         System.out.println("This is a recursive method.");
         message(n -1);
      }
   }



   public boolean test(int[] array, int target, int index) {
      if (array[index] == target)
         return true;
      else
         return test(array, target, index +1);
   }
}
