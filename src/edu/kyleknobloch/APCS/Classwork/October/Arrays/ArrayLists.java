package edu.kyleknobloch.APCS.Classwork.October.Arrays;
import org.w3c.dom.NameList;

import java.util.ArrayList; // Needed for ArrayList class

/**
 This program demonstrates an ArrayList.
 */

public class ArrayLists
{
    public static void main(String[] args)
    {
        // Create an ArrayList to hold some names.
        ArrayList<String> nameList = new ArrayList<String>();

        // Add some names to the ArrayList.
        nameList.add("James");
        nameList.add("Catherine");
        nameList.add("Bill");
        nameList.add("Kyle");
        nameList.add("Andrew");

        // Display the size of the ArrayList.
        System.out.println("The ArrayList has " + nameList.size() + " objects stored in it.");

        // Now display the items in nameList.
        for (int index = 0; index < nameList.size(); index++) {
            System.out.println(nameList.get(index));
        }

        System.out.println("--");

        // Now display the items in nameList.
        for (String name : nameList)
            System.out.println(name);


        nameList.remove(1);

        System.out.println("The item at index 1 is removed. " +
                "Here are the items now.");

        // Display the items in nameList and their indices.
        for (int index = 0; index < nameList.size(); index++)
        {
            System.out.println("Index: " + index + " Name: " +
                    nameList.get(index));
        }

        // Now insert an  item at index 1.
        nameList.add(1, "Mary");

        System.out.println("Mary was added at index 1. " +
                "Here are the items now.");

        // Display the items in nameList and their indices.
        for (int index = 0; index < nameList.size(); index++)
        {
            System.out.println("Index: " + index + " Name: " +
                    nameList.get(index));
        }



        // Now replace the item at index 1.
        nameList.set(1, "Becky");
        nameList.add(nameList.size(), "Kyle"); //Can't use .set when using nameList.size() for the index.

        System.out.println("Catherine was replaced with Becky. " +
                "Here are the items now.");
        System.out.println("I added Kyle again to the end. ");

        // Display the items in nameList and their indices.
        for (int index = 0; index < nameList.size(); index++)
        {
            System.out.println("Index: " + index + " Name: " +
                    nameList.get(index));
        }

        do {
            nameList.remove(0);
        } while (nameList.size() != 0);

        System.out.println("I removed things." + nameList.size());

        for (int index = 0; index < nameList.size(); index++)
        {
            System.out.println("-Index: " + index + " Name: " +
                    nameList.get(index));
        }

    }
}