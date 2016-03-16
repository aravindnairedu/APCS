package edu.kyleknobloch.APCS.Classwork.March.Drugan;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayTest2
{
   private Item itemList[];
   private int size, numElements = 0;
   private String fileName;

   public ArrayTest2(String fileName)
   {
      this.fileName = fileName;
   }

   public void fillList(String fileName)
   {
      File file = new File(fileName);
      int num, index = 0;

      try
      {
         Scanner inputFile = new Scanner(file);

         size = inputFile.nextInt();
         itemList = new Item[size];

         while ( inputFile.hasNext() )
         {
            num = inputFile.nextInt();
            Item item = new Item(num, 1);
            System.out.println("Inserting: " + num);
            insert(item);
         }
      }
      catch (FileNotFoundException e)
      {
         System.out.println("File Not Found!");
      }

      //cleanupArray();

   }


   public void insert(Item item)
   {
      /* Precondition: item is a valid Item object
       *
       * Postcondition: inserts item into a sorted assending order Array of Items
       *
       * Return: void
      */
      int i, j;

      if ( numElements == 0 )
         itemList[0] = item;
      else
      {
         for(i = 0; i < numElements; i++)
         {
             /* check for the location, which if found, shift numbers to the right */
            if(item.getItem() <= itemList[i].getItem() )
            {
               if ( item.getItem() == itemList[i].getItem() ) // Duplicates
               {
                  item.setOccurances();
                  System.out.println("Occurances: " + item.getOccurances());
                  break;
               }
               else
               {
                  for(j = numElements; j > i; j--)
                  {
                     itemList[j] = itemList[j-1];
                  }

                  break;
               }
            }
         }

         itemList[i] = item;
      }

      numElements++;

   } // end insert

   public void printList()
   {

      for ( int i = 0; i < numElements; i++)
         System.out.println("itemList[" + i + "] = " + itemList[i]);

   }

   public int search(int target)
   {
      /* Precondition: target is an integer
       *
       * Precondition: returns the index for which the target was found, -1 otherwise
       *
       * Return: int
      */

      // Using a Binary Search algorithm

      int index = -1;
      int left = 0,
              right = itemList.length -1,
              middle = 0;

      System.out.println("Right: " + right + " Left: " + left + " Middle: " + middle);

      while ( left <= right )
      {
         middle = ( left + right ) / 2;

         if ( target > itemList[middle].getItem() )
            left = middle + 1;
         else if ( target < itemList[middle].getItem() )
            right = middle -1;
         else
         {
            index = middle;
            break;
         }
      }

      return index;

   } // end search()

} // end class