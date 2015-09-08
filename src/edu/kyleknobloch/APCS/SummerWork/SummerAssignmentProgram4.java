//package edu.kyleknobloch.APCS.SummerWork;

/**
 * Author: Kyle Knobloch
 * Class: AP CS
 * Teacher: MR. DRUGAN
 * Date: July/12/15 at like 1:15am
 */


public class SummerAssignmentProgram4
{
    public SummerAssignmentProgram4()
    {
        int astristc = 1; //I know I can't spell

        for(int x = 0; x < 5; x++)
        {
            for(int y = 0; y < astristc; y++)
            {
                System.out.print("*");
            }
            astristc++;
            System.out.println();
        }
    }
    public static void main (String args[])
    {
        SummerAssignmentProgram4 app = new SummerAssignmentProgram4();
    }
}