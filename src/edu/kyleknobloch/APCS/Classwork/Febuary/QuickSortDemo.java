package edu.kyleknobloch.APCS.Classwork.Febuary;

/**
   This program demonstrates the QuickSort algorithm.
*/

public class QuickSortDemo
{
   /**
      main method
   */
   
   public static void main(String[] args)
   {
      int[] array = { 7, 3, 9, 2, 0, 1, 8, 4, 6, 5, 6, 43, 53, 42, 24, 24, 24, 24, 425, 32, 829043, 24, 0, 8, 38 };

      // Display the array as it is now.
      System.out.println("Before the sort:");
      for (int i = 0; i < array.length; i++)
         System.out.print(array[i] + " ");
      System.out.println();

      // Sort the array.
      quickSort(array, 0, array.length - 1);
      
      // Display the array again.
      System.out.println("After the sort:");
      for (int i = 0; i < array.length; i++)
         System.out.print(array[i] + " ");
      System.out.println();
   }

   /**
      The quickSort method uses the QuickSort algorithm to
      sort array, from array[start] through array[end].
      
      @param array The array to sort.
      @param start The starting subscript of the region
                   to sort.
      @param end The ending subscript of the region
                 to sort.
   */
   
   public static void quickSort(int array[], int start,
                                int end)
   {
      int pivotPoint;
      
      if (start < end)
      {
         // Get the pivot point.
         pivotPoint = partition(array, start, end);
         
         // Sort the first sub list.
         quickSort(array, start, pivotPoint - 1);
         
         // Sort the second sub list.
         quickSort(array, pivotPoint + 1, end);
      }
   }

    /**
     * Use quickSort(int array[], int start, int end) but not require the start and end points as we don't need to
     * hardcode those into the code.
     * @param array the array you would like to sort.
     */
   public static void quickSort(int array[]) {
      quickSort(array, 0, array.length -1); // subtract one from the length as arrays start at 0.

   }

   /**
      The partition method selects the value in the middle
      of the array as the pivot. The list is rearranged so
      all the values less than the pivot are on its left
      and all the values greater than pivot are on its
      right.
      
      @param array The array being sorted.
      @param start The starting subscript of the region
                   to sort.
      @param end The ending subscript of the region
                 to sort.
   */
   
   private static int partition(int array[], int start,
                                int end)
   {
      int pivotValue, pivotIndex, mid;

      mid = (start + end) / 2;

      swap(array, start, mid);
      pivotIndex = start;
      pivotValue = array[start];
      for (int scan = start + 1; scan <= end; scan++)
      {
         if (array[scan] < pivotValue)
         {
            pivotIndex++;
            swap(array, pivotIndex, scan);
         }
      }     
      swap(array, start, pivotIndex);
      
      return pivotIndex;
   }
   
   /**
      The swap method swaps the element at array[a] with
      the element at array[b].
      @param array The array containing the elements.
      @param a The first element to swap.
      @param b The second element to swap.
   */
   
   private static void swap(int[] array, int a, int b)
   {
      int temp;
      
      temp = array[a];
      array[a] = array[b];
      array[b] = temp;
   }
}
