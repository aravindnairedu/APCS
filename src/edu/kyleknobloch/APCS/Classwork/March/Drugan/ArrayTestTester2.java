package edu.kyleknobloch.APCS.Classwork.March.Drugan;

import java.util.Scanner;

public class ArrayTestTester2
{
   public static void main(String args[] )
   {
      Scanner console = new Scanner(System.in);
      int target = 0, loc = 0;
      
      ArrayTest2 at = new ArrayTest2("num.txt");
      at.fillList("num.txt");
      at.printList();
      
      /*
      System.out.print("Enter a target number: ");
      target = console.nextInt();
      
      loc = at.search(target);
      */
      if ( loc == -1 )
         System.out.println("Target: " + target + " Not Found in List");
      else
         System.out.println("Target: " + target + " at location: " + loc);
      
   } // end main


}