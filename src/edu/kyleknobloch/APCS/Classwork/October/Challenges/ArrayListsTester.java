package edu.kyleknobloch.APCS.Classwork.October.Challenges;
import java.util.Scanner;

public class ArrayListsTester {


    public static ArrayLists array = new ArrayLists();
    public static Scanner console = new Scanner(System.in);

    /**
     * The main menu
     */
    public static void main (String args[]) {

        String input;
        boolean run = true;


        System.out.println("Please add the first item of the ArrayList: "); //Want to make sure that there is something in the array.
        input = console.nextLine();

        array.addTo(input); //add to the array. 


        do { //Main Menu
            System.out.println("Current Array List: \n" + array.display()); //Display the array list when you enter the main menu

            System.out.println("Things you can do: \n[add] [remove] [search] [exit]\n\nPlease enter next command: "); //What can you do?
            input = console.nextLine(); //get the command

            if (input.equalsIgnoreCase("add")) { //Add an item to the array

                add();

            } else if (input.equalsIgnoreCase("remove")) { //remove

                remove();

            } else if (input.equalsIgnoreCase("search")) { //seatch for an item

                search();

            } else if (input.equalsIgnoreCase("exit")) { //exit
                System.out.println("Bye bye!");
                run = false; //exit

            } else {
                System.out.println("Sorry, I didn't understand that..."); //You typed the command wrong. 
            }

        } while (run);


    }


    /**
     * Add an item to the array from Beginning, end or a specific value
     */
    public static void add () {
        String input;
        String input1;
        String input2;

        System.out.println("Where would you like to add? [beginning] [specific] [end]: ");
        input = console.nextLine(); //What position? 

        if (input.equalsIgnoreCase("beginning")) { //beginning
            System.out.println("Okay, what would you like to add?");
            input1 = console.nextLine();
            array.addTo(0, input1);

        } else if (input.equalsIgnoreCase("specific")) { //specific
            System.out.println("Okay, what would you like to add?");
            input1 = console.nextLine();

            System.out.println("Where would you like this to go?");
            input2 = console.nextLine();
            int place = Integer.parseInt(input2);

            if (place > array.getSize()){
                System.out.println("That was too large! Added to the end of the array insted.");
                array.addToEnd(input1);
            } else
                array.addTo(place, input1);

        } else if (input.equalsIgnoreCase("end")) { //the end
            System.out.println("Okay, what would you like to add?");
            input1 = console.nextLine();
            array.addToEnd(input1);

        } else { //Something went wrong
            System.out.println("Sorry, I didn't understand that. Returning to main menu.");
            input = "RETURN TO MAIN";

        }
    }

    /**
     * Remove item or position from the array
     */
    public static void remove () {
        String input;
        String input1;

        System.out.println("What would you like to remove? [thing] [position]: ");
        input = console.nextLine(); //what are we removing?

        if (input.equalsIgnoreCase("thing")) { //remove an object
            System.out.println("What thing would you like to remove?");
            input1 = console.nextLine();
            array.removeFrom(input1);
        } else if (input.equalsIgnoreCase("position")) { //remove from position
            System.out.println("What position are we removing from? ");
            input1 = console.nextLine();
            array.removeFrom(Integer.parseInt(input1));
        } else { //Something went wrong.
            System.out.println("Sorry, I didn't understand that. Returning to main menu.");
            input = "MAIN MENU";
        }

    }

    /**
     * Search for an item in the array
     */
    public static void search () {
        String input;

        System.out.println("Please enter what you're searching for [item]. ");
        input = console.nextLine(); //get the item
        int position = array.searchFor(input);

        //analize the result
        if (position == -1)  //dose not excist
            System.out.println("Sorry, that dose not excist in the array.");
        else if (position >= 0) //it dose, display the position
            System.out.println("Thing " + input + " is at position " + position + "\n");
        else if (position == -2) //it did not run...
            System.out.println("YOU BROKE IT!");

    }

}


