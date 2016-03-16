package edu.kyleknobloch.APCS.Classwork.March.Drugan;

public class Item
{
   private int m_i_Item;
   private int m_i_Occurances;
   
   public Item (int item, int occurances)
   {
      m_i_Item = item;
      m_i_Occurances = occurances;
   }
   
   public int getItem()
   {
      return m_i_Item;
   }
   
   public int getOccurances()
   {
      return m_i_Occurances;
   }
   
   public void setOccurances()
   {
      //System.out.println("Duplicate found: " + getItem());
      m_i_Occurances++;
      //System.out.println("# of Occ: " + getOccurances());
   }
   
   public String toString()
   {
      return "Item: " + getItem() + " # of Occurances: " + getOccurances();
   }

} // end class