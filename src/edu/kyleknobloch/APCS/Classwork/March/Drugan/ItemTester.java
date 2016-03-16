package edu.kyleknobloch.APCS.Classwork.March.Drugan;

import java.util.Scanner;

public class ItemTester
{
   public static void main(String args[])
   {
      Scanner console = new Scanner(System.in);
      int target = 0, loc = 0;
      
      ArrayTest2 at = new ArrayTest2("num.txt");
      at.fillList("num.txt");
      at.printList();

      Item item = new Item(10, 5);
      
      System.out.println(item);
      
      item.setOccurances();
      item.setOccurances();
      System.out.println(item);
      System.out.println("Item: " + item.getItem());
      item.setOccurances();
      System.out.println(item);
      System.out.println("Occurances: " + item.getOccurances());
      
   }
}