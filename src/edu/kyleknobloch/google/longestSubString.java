package edu.kyleknobloch.google;

public class longestSubString {

    public static void main(String[] args) {
        System.out.println("\n\nababcbcbaaabbdef\n");
        longestSubString lss = new longestSubString("ababcbcbaaabbdef");

        System.out.println("\n\njgjrqqhghhrgqug\n");
        longestSubString lhs = new longestSubString("jgjrqqhghhrgqug");

        System.out.println("\n\nhetaeethtqqrgffffffgregega\n");
        longestSubString klhs = new longestSubString("hetaeethtqqrgffffffgregega");


    }


    public longestSubString(String input) {

        int index1 = 0;
        int index2 = 0;
        String first, second;
        first = second = null;

        for (int i = 0; i < input.length(); i++) {
            String tempLetter = input.substring(i, i + 1);
            //System.out.println("temp | "+ tempLetter);


            if (first == null) { //We don't have a fist letter to look for.
                first = tempLetter;
                index1 = i;

            } else if (second == null && !tempLetter.equals(first)) { // We do have first letter, but no second. second != first
                second = tempLetter;
                index2 = i;

            } else if (tempLetter.equals(first) || tempLetter.equals(second)) { //The letter matches one of the chars!
                index2 = i;

            } else { // This is the longest that the string get get right now...
                System.out.println(first + second + " | " + input.substring(index1, index2 + 1));
                String testingPreviousTempLetter = input.substring(i-1, i);


                if (!tempLetter.equals(first) && !testingPreviousTempLetter.equals(first))
                    second = tempLetter;

                else if (!tempLetter.equals(second) && !testingPreviousTempLetter.equals(second))
                    first = tempLetter;


                index1 = i -1;
                index2 = i;


                //System.out.println("Update: " + first + second + " | " + index1 + " " + index2 + " | " + input.substring(index1, index2 +1));
            }

        }

    }

}
