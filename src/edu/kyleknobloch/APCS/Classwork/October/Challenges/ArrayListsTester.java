package edu.kyleknobloch.APCS.Classwork.October.Challenges;


import java.util.Scanner;

public class ArrayListsTester {


    public static void main (String args[]) {

        ArrayLists array = new ArrayLists();
        Scanner console = new Scanner(System.in);
        String input;
        String input1;
        String input2;
        boolean run = true;


        System.out.println("Please add the first item of the ArrayList: ");
        input = console.nextLine();

        array.addTo(input);


        do {
            System.out.println("Current Array List: \n" + array.display());

            System.out.println("Things you can do: \n[add] [remove] [search] [exit]\n\nPlease enter next command: ");
            input = console.nextLine();

            if (input.equalsIgnoreCase("add")) {

                System.out.println("Where would you like to add? [beginning] [specific] [end]: ");
                input = console.nextLine();

                if (input.equalsIgnoreCase("beginning")) {
                    System.out.println("Okay, what would you like to add?");
                    input1 = console.nextLine();

                    array.addTo(0, input1);
                } else if (input.equalsIgnoreCase("specific")) {
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

                } else if (input.equalsIgnoreCase("end")) {

                    System.out.println("Okay, what would you like to add?");
                    input1 = console.nextLine();
                    array.addToEnd(input1);
                } else {
                    System.out.println("Sorry, I didn't understand that. Returning to main menu.");
                    input = "RETURN TO MAIN";

                }

            } else if (input.equalsIgnoreCase("remove")) {
                System.out.println("What would you like to remove? [thing] [position]: ");
                input = console.nextLine();

                if (input.equalsIgnoreCase("thing")) {
                    System.out.println("What thing would you like to remove?");
                    input1 = console.nextLine();
                    array.removeFrom(input1);
                } else if (input.equalsIgnoreCase("position")) {
                    System.out.println("What position are we removing from? ");
                    input1 = console.nextLine();
                    array.removeFrom(Integer.parseInt(input1));
                } else {
                    System.out.println("Sorry, I didn't understand that. Returning to main menu.");
                    input = "MAIN MENU";
                }

            } else if (input.equalsIgnoreCase("search")) {
                System.out.println("Please enter what you're searching for [item]. ");
                input = console.nextLine();
                int position = array.searchFor(input);

                if (position == -1)
                    System.out.println("Sorry, that dose not excist in the array.");
                else if (position >= 0)
                    System.out.println("Thing " + input + " is at position " + position + "\n");
                else if (position == -2)
                System.out.println("YOU BROKE IT!");

            } else if (input.equalsIgnoreCase("exit")) {
                System.out.println("Bye bye!");
                run = false;
            } else
                System.out.println("Sorry, I didn't understand that...");


        } while (run);

    }
}
