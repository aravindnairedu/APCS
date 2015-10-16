package edu.kyleknobloch.APCS.Notes;


/**
 * Created by kyleknobloch on 10/13/15,
 * For
 * *
 * Actions:
 */
public class ARRAYS {

    public static void main(String[] args) {

        /**
         *
         * Arrays are contiguous Blocks of Memory
         * It moves up in block. There is no *end* of memmory in the blocks, it just keeps jumping in blocks of memmory
         * Same data type
         * Zero based
         *
         */


        /*
            Declare an array

            int INT = 10; //define the size of the array
            [data type] [name][] = new [data type][INT];


            [name][number] = [data type]; //change what that block was holding (accessesing)


            [data type] [name][] = new [data type][] {
                    "data type",
                    "data type",
                    "data type"
                    }; //end

         */


        /**
         *
         * String arrays point to a object (the string) that points to the String's array (in the clasS)
         */
        String me[] = new String[] {
            "1",
            "2",
            "3" };

        System.out.println(me[0] + me[1] + me[2]);


        ARRAYS arrays; //Refrence

        int Array[];




    }
}



