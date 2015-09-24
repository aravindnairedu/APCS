package edu.kyleknobloch.APCS.Classwork.September;
import java.io.*;
import java.util.*;


public class FileSum {

    public static void main (String args[]) throws IOException {
        double sum =0;
        String fileName;
        Scanner console = new Scanner(System.in);


        //Grab file name
        System.out.println("Enter file name: (must be in the directory as this class!)");
        fileName = console.nextLine();

        //Setup the file
        File file = new File(fileName);
        Scanner inputFile = new Scanner(file);


        //Sum the file
        while (inputFile.hasNext()) {

            double number = inputFile.nextDouble();

            sum = sum + number;

        }
        inputFile.close();

        //YAIE! We have a sum!
        System.out.println("This is the sum: " + sum);

    }
}
